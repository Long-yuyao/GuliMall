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

import com.yuyao.guliproduct.entity.SkuAttrValueEntity;
import com.yuyao.guliproduct.service.SkuAttrValueService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * sku销售属性&值
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@RestController
@RequestMapping("skuattrvalue")
public class SkuAttrValueController {
	@Autowired
	private SkuAttrValueService skuAttrValueService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("skuattrvalue:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SkuAttrValueEntity> skuAttrValueList = skuAttrValueService.queryList(query);
		int total = skuAttrValueService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(skuAttrValueList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("skuattrvalue:info")
	public R info(@PathVariable("id") Long id){
		SkuAttrValueEntity skuAttrValue = skuAttrValueService.queryObject(id);
		
		return R.ok().put("skuAttrValue", skuAttrValue);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("skuattrvalue:save")
	public R save(@RequestBody SkuAttrValueEntity skuAttrValue){
		skuAttrValueService.save(skuAttrValue);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("skuattrvalue:update")
	public R update(@RequestBody SkuAttrValueEntity skuAttrValue){
		skuAttrValueService.update(skuAttrValue);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("skuattrvalue:delete")
	public R delete(@RequestBody Long[] ids){
		skuAttrValueService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
