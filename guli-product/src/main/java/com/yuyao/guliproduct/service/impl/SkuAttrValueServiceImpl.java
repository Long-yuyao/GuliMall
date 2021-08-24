package com.yuyao.guliproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yuyao.guliproduct.dao.SkuAttrValueDao;
import com.yuyao.guliproduct.entity.SkuAttrValueEntity;
import com.yuyao.guliproduct.service.SkuAttrValueService;



@Service("skuAttrValueService")
public class SkuAttrValueServiceImpl implements SkuAttrValueService {
	@Autowired
	private SkuAttrValueDao skuAttrValueDao;
	
	@Override
	public SkuAttrValueEntity queryObject(Long id){
		return skuAttrValueDao.queryObject(id);
	}
	
	@Override
	public List<SkuAttrValueEntity> queryList(Map<String, Object> map){
		return skuAttrValueDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return skuAttrValueDao.queryTotal(map);
	}
	
	@Override
	public void save(SkuAttrValueEntity skuAttrValue){
		skuAttrValueDao.save(skuAttrValue);
	}
	
	@Override
	public void update(SkuAttrValueEntity skuAttrValue){
		skuAttrValueDao.proupdate(skuAttrValue);
	}
	
	@Override
	public void delete(Long id){
		skuAttrValueDao.prodelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		skuAttrValueDao.deleteBatch(ids);
	}
	
}
