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

import com.yuyao.guliproduct.entity.SkuImagesEntity;
import com.yuyao.guliproduct.service.SkuImagesService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * sku图片
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@RestController
@RequestMapping("skuimages")
public class SkuImagesController {
	@Autowired
	private SkuImagesService skuImagesService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("skuimages:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SkuImagesEntity> skuImagesList = skuImagesService.queryList(query);
		int total = skuImagesService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(skuImagesList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("skuimages:info")
	public R info(@PathVariable("id") Long id){
		SkuImagesEntity skuImages = skuImagesService.queryObject(id);
		
		return R.ok().put("skuImages", skuImages);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("skuimages:save")
	public R save(@RequestBody SkuImagesEntity skuImages){
		skuImagesService.save(skuImages);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("skuimages:update")
	public R update(@RequestBody SkuImagesEntity skuImages){
		skuImagesService.update(skuImages);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("skuimages:delete")
	public R delete(@RequestBody Long[] ids){
		skuImagesService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
