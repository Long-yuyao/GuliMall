package com.yuyao.guliproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yuyao.guliproduct.dao.SkuDao;
import com.yuyao.guliproduct.entity.SkuEntity;
import com.yuyao.guliproduct.service.SkuService;



@Service("skuService")
public class SkuServiceImpl implements SkuService {
	@Autowired
	private SkuDao skuDao;
	
	@Override
	public SkuEntity queryObject(Long id){
		return skuDao.queryObject(id);
	}
	
	@Override
	public List<SkuEntity> queryList(Map<String, Object> map){
		return skuDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return skuDao.queryTotal(map);
	}
	
	@Override
	public void save(SkuEntity sku){
		skuDao.save(sku);
	}
	
	@Override
	public void update(SkuEntity sku){
		skuDao.proupdate(sku);
	}
	
	@Override
	public void delete(Long id){
		skuDao.prodelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		skuDao.deleteBatch(ids);
	}
	
}
