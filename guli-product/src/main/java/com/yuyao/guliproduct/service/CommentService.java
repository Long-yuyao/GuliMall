package com.yuyao.guliproduct.service;

import com.yuyao.guliproduct.entity.CommentEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品评价
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public interface CommentService {
	
	CommentEntity queryObject(Long id);
	
	List<CommentEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(CommentEntity comment);
	
	void update(CommentEntity comment);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
