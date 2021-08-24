package gulimember.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulimember.dao.UserLevelDao;
import gulimember.entity.UserLevelEntity;
import gulimember.service.UserLevelService;



@Service("userLevelService")
public class UserLevelServiceImpl implements UserLevelService {
	@Autowired
	private UserLevelDao userLevelDao;
	
	@Override
	public UserLevelEntity queryObject(Long id){
		return userLevelDao.queryObject(id);
	}
	
	@Override
	public List<UserLevelEntity> queryList(Map<String, Object> map){
		return userLevelDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return userLevelDao.queryTotal(map);
	}
	
	@Override
	public void save(UserLevelEntity userLevel){
		userLevelDao.save(userLevel);
	}
	
	@Override
	public void update(UserLevelEntity userLevel){
		userLevelDao.updatee(userLevel);
	}
	
	@Override
	public void delete(Long id){
		userLevelDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		userLevelDao.deleteBatch(ids);
	}
	
}
