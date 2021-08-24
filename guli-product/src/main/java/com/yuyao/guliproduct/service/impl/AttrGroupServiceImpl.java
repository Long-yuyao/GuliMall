package com.yuyao.guliproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yuyao.guliproduct.dao.AttrGroupDao;
import com.yuyao.guliproduct.entity.AttrGroupEntity;
import com.yuyao.guliproduct.service.AttrGroupService;



@Service("attrGroupService")
public class AttrGroupServiceImpl implements AttrGroupService {
	@Autowired
	private AttrGroupDao attrGroupDao;
	
	@Override
	public AttrGroupEntity queryObject(Long id){
		return attrGroupDao.selectById(id);
	}
	
	@Override
	public List<AttrGroupEntity> queryList(Map<String, Object> map){
		return attrGroupDao.selectByMap(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		List<AttrGroupEntity> ans = attrGroupDao.selectByMap(map);
		return ans.size();
	}
	
	@Override
	public void save(AttrGroupEntity attrGroup){
		attrGroupDao.save(attrGroup);
	}
	
	@Override
	public void update(AttrGroupEntity attrGroup){
		attrGroupDao.proupdate(attrGroup);
	}
	
	@Override
	public void delete(Long id){
		attrGroupDao.prodelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		attrGroupDao.deleteBatch(ids);
	}
	
}
