package com.yuyao.guliproduct.service;

import com.yuyao.guliproduct.entity.CategoryBrandEntity;

import java.util.List;
import java.util.Map;

/**
 * 品牌分类关联
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public interface CategoryBrandService {
	
	CategoryBrandEntity queryObject(Long id);
	
	List<CategoryBrandEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(CategoryBrandEntity categoryBrand);
	
	void update(CategoryBrandEntity categoryBrand);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
