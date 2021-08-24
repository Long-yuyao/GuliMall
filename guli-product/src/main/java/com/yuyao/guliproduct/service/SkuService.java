package com.yuyao.guliproduct.service;

import com.yuyao.guliproduct.entity.SkuEntity;

import java.util.List;
import java.util.Map;

/**
 * sku信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public interface SkuService {
	
	SkuEntity queryObject(Long id);
	
	List<SkuEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SkuEntity sku);
	
	void update(SkuEntity sku);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
