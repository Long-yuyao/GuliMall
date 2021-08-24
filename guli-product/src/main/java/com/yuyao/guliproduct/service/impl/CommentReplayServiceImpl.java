package com.yuyao.guliproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yuyao.guliproduct.dao.CommentReplayDao;
import com.yuyao.guliproduct.entity.CommentReplayEntity;
import com.yuyao.guliproduct.service.CommentReplayService;



@Service("commentReplayService")
public class CommentReplayServiceImpl implements CommentReplayService {
	@Autowired
	private CommentReplayDao commentReplayDao;
	
	@Override
	public CommentReplayEntity queryObject(Long id){
		return commentReplayDao.queryObject(id);
	}
	
	@Override
	public List<CommentReplayEntity> queryList(Map<String, Object> map){
		return commentReplayDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return commentReplayDao.queryTotal(map);
	}
	
	@Override
	public void save(CommentReplayEntity commentReplay){
		commentReplayDao.save(commentReplay);
	}
	
	@Override
	public void update(CommentReplayEntity commentReplay){
		commentReplayDao.proupdate(commentReplay);
	}
	
	@Override
	public void delete(Long id){
		commentReplayDao.prodelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		commentReplayDao.deleteBatch(ids);
	}
	
}
