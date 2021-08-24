package gulimember.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulimember.dao.UserLoginLogDao;
import gulimember.entity.UserLoginLogEntity;
import gulimember.service.UserLoginLogService;



@Service("userLoginLogService")
public class UserLoginLogServiceImpl implements UserLoginLogService {
	@Autowired
	private UserLoginLogDao userLoginLogDao;
	
	@Override
	public UserLoginLogEntity queryObject(Long id){
		return userLoginLogDao.queryObject(id);
	}
	
	@Override
	public List<UserLoginLogEntity> queryList(Map<String, Object> map){
		return userLoginLogDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return userLoginLogDao.queryTotal(map);
	}
	
	@Override
	public void save(UserLoginLogEntity userLoginLog){
		userLoginLogDao.save(userLoginLog);
	}
	
	@Override
	public void update(UserLoginLogEntity userLoginLog){
		userLoginLogDao.updatee(userLoginLog);
	}
	
	@Override
	public void delete(Long id){
		userLoginLogDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		userLoginLogDao.deleteBatch(ids);
	}
	
}
