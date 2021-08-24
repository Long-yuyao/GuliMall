package com.yuyao.guliproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yuyao.guliproduct.dao.AttrDao;
import com.yuyao.guliproduct.entity.AttrEntity;
import com.yuyao.guliproduct.service.AttrService;



@Service("attrService")
public class AttrServiceImpl implements AttrService {
	@Autowired
	private AttrDao attrDao;
	
	@Override
	public AttrEntity queryObject(Long id){
		return attrDao.queryObject(id);
	}
	
	@Override
	public List<AttrEntity> queryList(Map<String, Object> map){
		return attrDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return attrDao.queryTotal(map);
	}
	
	@Override
	public void save(AttrEntity attr){
		attrDao.save(attr);
	}
	
	@Override
	public void update(AttrEntity attr){
		attrDao.proupdate(attr);
	}
	
	@Override
	public void delete(Long id){
		attrDao.prodelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		attrDao.deleteBatch(ids);
	}
	
}
