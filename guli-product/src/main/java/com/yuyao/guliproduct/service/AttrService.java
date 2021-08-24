package com.yuyao.guliproduct.service;

import com.yuyao.guliproduct.entity.AttrEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public interface AttrService {
	
	AttrEntity queryObject(Long id);
	
	List<AttrEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(AttrEntity attr);
	
	void update(AttrEntity attr);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
