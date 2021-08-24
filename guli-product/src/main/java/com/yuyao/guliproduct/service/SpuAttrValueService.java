package com.yuyao.guliproduct.service;

import com.yuyao.guliproduct.entity.SpuAttrValueEntity;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public interface SpuAttrValueService {
	
	SpuAttrValueEntity queryObject(Long id);
	
	List<SpuAttrValueEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SpuAttrValueEntity spuAttrValue);
	
	void update(SpuAttrValueEntity spuAttrValue);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
