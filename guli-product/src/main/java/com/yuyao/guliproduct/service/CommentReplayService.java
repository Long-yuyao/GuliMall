package com.yuyao.guliproduct.service;

import com.yuyao.guliproduct.entity.CommentReplayEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品评价回复关系
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public interface CommentReplayService {
	
	CommentReplayEntity queryObject(Long id);
	
	List<CommentReplayEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(CommentReplayEntity commentReplay);
	
	void update(CommentReplayEntity commentReplay);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
