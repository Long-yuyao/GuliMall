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

import com.yuyao.guliproduct.entity.SkuEntity;
import com.yuyao.guliproduct.service.SkuService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * sku信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@RestController
@RequestMapping("sku")
public class SkuController {
	@Autowired
	private SkuService skuService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sku:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SkuEntity> skuList = skuService.queryList(query);
		int total = skuService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(skuList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("sku:info")
	public R info(@PathVariable("id") Long id){
		SkuEntity sku = skuService.queryObject(id);
		
		return R.ok().put("sku", sku);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("sku:save")
	public R save(@RequestBody SkuEntity sku){
		skuService.save(sku);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("sku:update")
	public R update(@RequestBody SkuEntity sku){
		skuService.update(sku);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("sku:delete")
	public R delete(@RequestBody Long[] ids){
		skuService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
