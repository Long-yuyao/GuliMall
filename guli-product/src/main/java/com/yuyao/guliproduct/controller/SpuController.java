package com.yuyao.guliproduct.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yuyao.guliproduct.entity.SpuEntity;
import com.yuyao.guliproduct.service.SpuService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * spu信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@RestController
@RequestMapping("spu")
public class SpuController {
	@Autowired
	private SpuService spuService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("spu:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SpuEntity> spuList = spuService.queryList(query);
		int total = spuService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(spuList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("spu:info")
	public R info(@PathVariable("id") Long id){
		SpuEntity spu = spuService.queryObject(id);
		
		return R.ok().put("spu", spu);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("spu:save")
	public R save(@RequestBody SpuEntity spu){
		spuService.save(spu);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("spu:update")
	public R update(@RequestBody SpuEntity spu){
		spuService.update(spu);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("spu:delete")
	public R delete(@RequestBody Long[] ids){
		spuService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
