package com.yuyao.guliproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yuyao.guliproduct.dao.SpuDao;
import com.yuyao.guliproduct.entity.SpuEntity;
import com.yuyao.guliproduct.service.SpuService;



@Service("spuService")
public class SpuServiceImpl implements SpuService {
	@Autowired
	private SpuDao spuDao;
	
	@Override
	public SpuEntity queryObject(Long id){
		return spuDao.queryObject(id);
	}
	
	@Override
	public List<SpuEntity> queryList(Map<String, Object> map){
		return spuDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return spuDao.queryTotal(map);
	}
	
	@Override
	public void save(SpuEntity spu){
		spuDao.save(spu);
	}
	
	@Override
	public void update(SpuEntity spu){
		spuDao.proupdate(spu);
	}
	
	@Override
	public void delete(Long id){
		spuDao.prodelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		spuDao.deleteBatch(ids);
	}
	
}
