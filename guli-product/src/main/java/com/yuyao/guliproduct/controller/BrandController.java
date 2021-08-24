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

import com.yuyao.guliproduct.entity.BrandEntity;
import com.yuyao.guliproduct.service.BrandService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 品牌
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@RestController
@RequestMapping("brand")
public class BrandController {
	@Autowired
	private BrandService brandService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("brand:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<BrandEntity> brandList = brandService.queryList(query);
		int total = brandService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(brandList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("brand:info")
	public R info(@PathVariable("id") Long id){
		BrandEntity brand = brandService.queryObject(id);
		
		return R.ok().put("brand", brand);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("brand:save")
	public R save(@RequestBody BrandEntity brand){
		brandService.save(brand);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("brand:update")
	public R update(@RequestBody BrandEntity brand){
		brandService.update(brand);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("brand:delete")
	public R delete(@RequestBody Long[] ids){
		brandService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
