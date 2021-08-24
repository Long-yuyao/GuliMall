package gulimember.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulimember.dao.UserCollectSubjectDao;
import gulimember.entity.UserCollectSubjectEntity;
import gulimember.service.UserCollectSubjectService;



@Service("userCollectSubjectService")
public class UserCollectSubjectServiceImpl implements UserCollectSubjectService {
	@Autowired
	private UserCollectSubjectDao userCollectSubjectDao;
	
	@Override
	public UserCollectSubjectEntity queryObject(Long id){
		return userCollectSubjectDao.queryObject(id);
	}
	
	@Override
	public List<UserCollectSubjectEntity> queryList(Map<String, Object> map){
		return userCollectSubjectDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return userCollectSubjectDao.queryTotal(map);
	}
	
	@Override
	public void save(UserCollectSubjectEntity userCollectSubject){
		userCollectSubjectDao.save(userCollectSubject);
	}
	
	@Override
	public void update(UserCollectSubjectEntity userCollectSubject){
		userCollectSubjectDao.updatee(userCollectSubject);
	}
	
	@Override
	public void delete(Long id){
		userCollectSubjectDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		userCollectSubjectDao.deleteBatch(ids);
	}
	
}
