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

import com.yuyao.guliproduct.entity.CategoryBrandEntity;
import com.yuyao.guliproduct.service.CategoryBrandService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 品牌分类关联
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@RestController
@RequestMapping("categorybrand")
public class CategoryBrandController {
	@Autowired
	private CategoryBrandService categoryBrandService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("categorybrand:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<CategoryBrandEntity> categoryBrandList = categoryBrandService.queryList(query);
		int total = categoryBrandService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(categoryBrandList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("categorybrand:info")
	public R info(@PathVariable("id") Long id){
		CategoryBrandEntity categoryBrand = categoryBrandService.queryObject(id);
		
		return R.ok().put("categoryBrand", categoryBrand);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("categorybrand:save")
	public R save(@RequestBody CategoryBrandEntity categoryBrand){
		categoryBrandService.save(categoryBrand);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("categorybrand:update")
	public R update(@RequestBody CategoryBrandEntity categoryBrand){
		categoryBrandService.update(categoryBrand);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("categorybrand:delete")
	public R delete(@RequestBody Long[] ids){
		categoryBrandService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
