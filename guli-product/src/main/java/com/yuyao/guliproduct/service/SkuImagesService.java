package com.yuyao.guliproduct.service;

import com.yuyao.guliproduct.entity.SkuImagesEntity;

import java.util.List;
import java.util.Map;

/**
 * sku图片
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public interface SkuImagesService {
	
	SkuImagesEntity queryObject(Long id);
	
	List<SkuImagesEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SkuImagesEntity skuImages);
	
	void update(SkuImagesEntity skuImages);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
