package com.yuyao.guliproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yuyao.guliproduct.dao.CategoryBrandDao;
import com.yuyao.guliproduct.entity.CategoryBrandEntity;
import com.yuyao.guliproduct.service.CategoryBrandService;



@Service("categoryBrandService")
public class CategoryBrandServiceImpl implements CategoryBrandService {
	@Autowired
	private CategoryBrandDao categoryBrandDao;
	
	@Override
	public CategoryBrandEntity queryObject(Long id){
		return categoryBrandDao.queryObject(id);
	}
	
	@Override
	public List<CategoryBrandEntity> queryList(Map<String, Object> map){
		return categoryBrandDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return categoryBrandDao.queryTotal(map);
	}
	
	@Override
	public void save(CategoryBrandEntity categoryBrand){
		categoryBrandDao.save(categoryBrand);
	}
	
	@Override
	public void update(CategoryBrandEntity categoryBrand){
		categoryBrandDao.proupdate(categoryBrand);
	}
	
	@Override
	public void delete(Long id){
		categoryBrandDao.prodelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		categoryBrandDao.deleteBatch(ids);
	}
	
}
