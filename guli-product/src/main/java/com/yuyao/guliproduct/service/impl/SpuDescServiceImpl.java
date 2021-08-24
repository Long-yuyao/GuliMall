package com.yuyao.guliproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yuyao.guliproduct.dao.SpuDescDao;
import com.yuyao.guliproduct.entity.SpuDescEntity;
import com.yuyao.guliproduct.service.SpuDescService;



@Service("spuDescService")
public class SpuDescServiceImpl implements SpuDescService {
	@Autowired
	private SpuDescDao spuDescDao;
	
	@Override
	public SpuDescEntity queryObject(Long spuId){
		return spuDescDao.queryObject(spuId);
	}
	
	@Override
	public List<SpuDescEntity> queryList(Map<String, Object> map){
		return spuDescDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return spuDescDao.queryTotal(map);
	}
	
	@Override
	public void save(SpuDescEntity spuDesc){
		spuDescDao.save(spuDesc);
	}
	
	@Override
	public void update(SpuDescEntity spuDesc){
		spuDescDao.proupdate(spuDesc);
	}
	
	@Override
	public void delete(Long spuId){
		spuDescDao.prodelete(spuId);
	}
	
	@Override
	public void deleteBatch(Long[] spuIds){
		spuDescDao.deleteBatch(spuIds);
	}
	
}
