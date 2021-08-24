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

import com.yuyao.guliproduct.entity.CommentReplayEntity;
import com.yuyao.guliproduct.service.CommentReplayService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 商品评价回复关系
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@RestController
@RequestMapping("commentreplay")
public class CommentReplayController {
	@Autowired
	private CommentReplayService commentReplayService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("commentreplay:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<CommentReplayEntity> commentReplayList = commentReplayService.queryList(query);
		int total = commentReplayService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(commentReplayList, total, query.getLimit(), query.getCurrPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("commentreplay:info")
	public R info(@PathVariable("id") Long id){
		CommentReplayEntity commentReplay = commentReplayService.queryObject(id);
		
		return R.ok().put("commentReplay", commentReplay);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("commentreplay:save")
	public R save(@RequestBody CommentReplayEntity commentReplay){
		commentReplayService.save(commentReplay);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("commentreplay:update")
	public R update(@RequestBody CommentReplayEntity commentReplay){
		commentReplayService.update(commentReplay);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("commentreplay:delete")
	public R delete(@RequestBody Long[] ids){
		commentReplayService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
