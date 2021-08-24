package com.yuyao.guliproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yuyao.guliproduct.dao.CommentDao;
import com.yuyao.guliproduct.entity.CommentEntity;
import com.yuyao.guliproduct.service.CommentService;



@Service("commentService")
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentDao commentDao;
	
	@Override
	public CommentEntity queryObject(Long id){
		return commentDao.queryObject(id);
	}
	
	@Override
	public List<CommentEntity> queryList(Map<String, Object> map){
		return commentDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return commentDao.queryTotal(map);
	}
	
	@Override
	public void save(CommentEntity comment){
		commentDao.save(comment);
	}
	
	@Override
	public void update(CommentEntity comment){
		commentDao.proupdate(comment);
	}
	
	@Override
	public void delete(Long id){
		commentDao.prodelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		commentDao.deleteBatch(ids);
	}
	
}
