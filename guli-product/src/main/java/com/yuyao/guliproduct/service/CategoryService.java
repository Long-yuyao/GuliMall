package com.yuyao.guliproduct.service;

import com.yuyao.guliproduct.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public interface CategoryService {
	
	CategoryEntity queryObject(Long id);
	
	List<CategoryEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(CategoryEntity category);
	
	void update(CategoryEntity category);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
