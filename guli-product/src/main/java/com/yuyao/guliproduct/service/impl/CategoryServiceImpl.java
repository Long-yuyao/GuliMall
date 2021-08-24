package com.yuyao.guliproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yuyao.guliproduct.dao.CategoryDao;
import com.yuyao.guliproduct.entity.CategoryEntity;
import com.yuyao.guliproduct.service.CategoryService;



@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public CategoryEntity queryObject(Long id){
		return categoryDao.queryObject(id);
	}
	
	@Override
	public List<CategoryEntity> queryList(Map<String, Object> map){
		return categoryDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return categoryDao.queryTotal(map);
	}
	
	@Override
	public void save(CategoryEntity category){
		categoryDao.save(category);
	}
	
	@Override
	public void update(CategoryEntity category){
		categoryDao.proupdate(category);
	}
	
	@Override
	public void delete(Long id){
		categoryDao.prodelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		categoryDao.deleteBatch(ids);
	}
	
}
