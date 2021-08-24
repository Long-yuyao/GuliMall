package com.yuyao.guliproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yuyao.guliproduct.dao.SkuImagesDao;
import com.yuyao.guliproduct.entity.SkuImagesEntity;
import com.yuyao.guliproduct.service.SkuImagesService;



@Service("skuImagesService")
public class SkuImagesServiceImpl implements SkuImagesService {
	@Autowired
	private SkuImagesDao skuImagesDao;
	
	@Override
	public SkuImagesEntity queryObject(Long id){
		return skuImagesDao.queryObject(id);
	}
	
	@Override
	public List<SkuImagesEntity> queryList(Map<String, Object> map){
		return skuImagesDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return skuImagesDao.queryTotal(map);
	}
	
	@Override
	public void save(SkuImagesEntity skuImages){
		skuImagesDao.save(skuImages);
	}
	
	@Override
	public void update(SkuImagesEntity skuImages){
		skuImagesDao.proupdate(skuImages);
	}
	
	@Override
	public void delete(Long id){
		skuImagesDao.prodelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		skuImagesDao.deleteBatch(ids);
	}
	
}
