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

import com.yuyao.guliproduct.entity.CommentEntity;
import com.yuyao.guliproduct.service.CommentService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 商品评价
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@RestController
@RequestMapping("comment")
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("comment:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<CommentEntity> commentList = commentService.queryList(query);
		int total = commentService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(commentList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("comment:info")
	public R info(@PathVariable("id") Long id){
		CommentEntity comment = commentService.queryObject(id);
		
		return R.ok().put("comment", comment);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("comment:save")
	public R save(@RequestBody CommentEntity comment){
		commentService.save(comment);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("comment:update")
	public R update(@RequestBody CommentEntity comment){
		commentService.update(comment);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("comment:delete")
	public R delete(@RequestBody Long[] ids){
		commentService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
