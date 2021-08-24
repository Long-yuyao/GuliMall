package com.yuyao.guliproduct.service;

import com.yuyao.guliproduct.entity.SkuAttrValueEntity;

import java.util.List;
import java.util.Map;

/**
 * sku销售属性&值
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public interface SkuAttrValueService {
	
	SkuAttrValueEntity queryObject(Long id);
	
	List<SkuAttrValueEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SkuAttrValueEntity skuAttrValue);
	
	void update(SkuAttrValueEntity skuAttrValue);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
