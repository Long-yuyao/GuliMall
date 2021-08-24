package com.yuyao.guliproduct.service;

import com.yuyao.guliproduct.entity.BrandEntity;

import java.util.List;
import java.util.Map;

/**
 * 品牌
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public interface BrandService {
	
	BrandEntity queryObject(Long id);
	
	List<BrandEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(BrandEntity brand);
	
	void update(BrandEntity brand);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
