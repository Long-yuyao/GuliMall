package com.yuyao.guliproduct.service;

import com.yuyao.guliproduct.entity.SpuEntity;

import java.util.List;
import java.util.Map;

/**
 * spu信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public interface SpuService {
	
	SpuEntity queryObject(Long id);
	
	List<SpuEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SpuEntity spu);
	
	void update(SpuEntity spu);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
