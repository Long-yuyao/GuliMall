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

import com.yuyao.guliproduct.entity.SpuDescEntity;
import com.yuyao.guliproduct.service.SpuDescService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * spu信息介绍
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@RestController
@RequestMapping("spudesc")
public class SpuDescController {
	@Autowired
	private SpuDescService spuDescService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("spudesc:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SpuDescEntity> spuDescList = spuDescService.queryList(query);
		int total = spuDescService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(spuDescList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{spuId}")
	@RequiresPermissions("spudesc:info")
	public R info(@PathVariable("spuId") Long spuId){
		SpuDescEntity spuDesc = spuDescService.queryObject(spuId);
		
		return R.ok().put("spuDesc", spuDesc);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("spudesc:save")
	public R save(@RequestBody SpuDescEntity spuDesc){
		spuDescService.save(spuDesc);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("spudesc:update")
	public R update(@RequestBody SpuDescEntity spuDesc){
		spuDescService.update(spuDesc);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("spudesc:delete")
	public R delete(@RequestBody Long[] spuIds){
		spuDescService.deleteBatch(spuIds);
		
		return R.ok();
	}
	
}
