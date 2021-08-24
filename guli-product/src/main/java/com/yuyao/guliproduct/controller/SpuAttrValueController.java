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

import com.yuyao.guliproduct.entity.SpuAttrValueEntity;
import com.yuyao.guliproduct.service.SpuAttrValueService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * spu属性值
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@RestController
@RequestMapping("spuattrvalue")
public class SpuAttrValueController {
	@Autowired
	private SpuAttrValueService spuAttrValueService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("spuattrvalue:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SpuAttrValueEntity> spuAttrValueList = spuAttrValueService.queryList(query);
		int total = spuAttrValueService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(spuAttrValueList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("spuattrvalue:info")
	public R info(@PathVariable("id") Long id){
		SpuAttrValueEntity spuAttrValue = spuAttrValueService.queryObject(id);
		
		return R.ok().put("spuAttrValue", spuAttrValue);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("spuattrvalue:save")
	public R save(@RequestBody SpuAttrValueEntity spuAttrValue){
		spuAttrValueService.save(spuAttrValue);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("spuattrvalue:update")
	public R update(@RequestBody SpuAttrValueEntity spuAttrValue){
		spuAttrValueService.update(spuAttrValue);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("spuattrvalue:delete")
	public R delete(@RequestBody Long[] ids){
		spuAttrValueService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
