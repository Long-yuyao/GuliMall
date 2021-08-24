package com.yuyao.guliproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yuyao.guliproduct.dao.BrandDao;
import com.yuyao.guliproduct.entity.BrandEntity;
import com.yuyao.guliproduct.service.BrandService;



@Service("brandService")
public class BrandServiceImpl implements BrandService {
	@Autowired
	private BrandDao brandDao;
	
	@Override
	public BrandEntity queryObject(Long id){
		return brandDao.queryObject(id);
	}
	
	@Override
	public List<BrandEntity> queryList(Map<String, Object> map){
		return brandDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return brandDao.queryTotal(map);
	}
	
	@Override
	public void save(BrandEntity brand){
		brandDao.save(brand);
	}
	
	@Override
	public void update(BrandEntity brand){
		brandDao.proupdate(brand);
	}
	
	@Override
	public void delete(Long id){
		brandDao.prodelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		brandDao.deleteBatch(ids);
	}
	
}
