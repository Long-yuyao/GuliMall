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

import com.yuyao.guliproduct.entity.AttrEntity;
import com.yuyao.guliproduct.service.AttrService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 商品属性
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@RestController
@RequestMapping("/attr")
public class AttrController {
	@Autowired
	private AttrService attrService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("attr:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<AttrEntity> attrList = attrService.queryList(query);
		int total = attrService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(attrList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("attr:info")
	public R info(@PathVariable("id") Long id){
		AttrEntity attr = attrService.queryObject(id);
		
		return R.ok().put("attr", attr);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("attr:save")
	public R save(@RequestBody AttrEntity attr){
		attrService.save(attr);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("attr:update")
	public R update(@RequestBody AttrEntity attr){
		attrService.update(attr);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("attr:delete")
	public R delete(@RequestBody Long[] ids){
		attrService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
