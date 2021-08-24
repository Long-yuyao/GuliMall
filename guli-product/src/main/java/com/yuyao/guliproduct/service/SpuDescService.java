package com.yuyao.guliproduct.service;

import com.yuyao.guliproduct.entity.SpuDescEntity;

import java.util.List;
import java.util.Map;

/**
 * spu信息介绍
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public interface SpuDescService {
	
	SpuDescEntity queryObject(Long spuId);
	
	List<SpuDescEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SpuDescEntity spuDesc);
	
	void update(SpuDescEntity spuDesc);
	
	void delete(Long spuId);
	
	void deleteBatch(Long[] spuIds);
}
