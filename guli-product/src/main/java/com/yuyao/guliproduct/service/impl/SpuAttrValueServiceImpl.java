package com.yuyao.guliproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yuyao.guliproduct.dao.SpuAttrValueDao;
import com.yuyao.guliproduct.entity.SpuAttrValueEntity;
import com.yuyao.guliproduct.service.SpuAttrValueService;



@Service("spuAttrValueService")
public class SpuAttrValueServiceImpl implements SpuAttrValueService {
	@Autowired
	private SpuAttrValueDao spuAttrValueDao;
	
	@Override
	public SpuAttrValueEntity queryObject(Long id){
		return spuAttrValueDao.queryObject(id);
	}
	
	@Override
	public List<SpuAttrValueEntity> queryList(Map<String, Object> map){
		return spuAttrValueDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return spuAttrValueDao.queryTotal(map);
	}
	
	@Override
	public void save(SpuAttrValueEntity spuAttrValue){
		spuAttrValueDao.save(spuAttrValue);
	}
	
	@Override
	public void update(SpuAttrValueEntity spuAttrValue){
		spuAttrValueDao.proupdate(spuAttrValue);
	}
	
	@Override
	public void delete(Long id){
		spuAttrValueDao.prodelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		spuAttrValueDao.deleteBatch(ids);
	}
	
}
