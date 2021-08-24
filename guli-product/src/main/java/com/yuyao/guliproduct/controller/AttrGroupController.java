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

import com.yuyao.guliproduct.entity.AttrGroupEntity;
import com.yuyao.guliproduct.service.AttrGroupService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 属性分组
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@RestController
@RequestMapping("attrgroup")
public class AttrGroupController {
	@Autowired
	private AttrGroupService attrGroupService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("attrgroup:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<AttrGroupEntity> attrGroupList = attrGroupService.queryList(query);
		int total = attrGroupService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(attrGroupList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("attrgroup:info")
	public R info(@PathVariable("id") Long id){
		AttrGroupEntity attrGroup = attrGroupService.queryObject(id);
		
		return R.ok().put("attrGroup", attrGroup);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("attrgroup:save")
	public R save(@RequestBody AttrGroupEntity attrGroup){
		attrGroupService.save(attrGroup);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("attrgroup:update")
	public R update(@RequestBody AttrGroupEntity attrGroup){
		attrGroupService.update(attrGroup);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("attrgroup:delete")
	public R delete(@RequestBody Long[] ids){
		attrGroupService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
