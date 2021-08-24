package gulimember.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulimember.dao.UserStatisticsDao;
import gulimember.entity.UserStatisticsEntity;
import gulimember.service.UserStatisticsService;



@Service("userStatisticsService")
public class UserStatisticsServiceImpl implements UserStatisticsService {
	@Autowired
	private UserStatisticsDao userStatisticsDao;
	
	@Override
	public UserStatisticsEntity queryObject(Long id){
		return userStatisticsDao.queryObject(id);
	}
	
	@Override
	public List<UserStatisticsEntity> queryList(Map<String, Object> map){
		return userStatisticsDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return userStatisticsDao.queryTotal(map);
	}
	
	@Override
	public void save(UserStatisticsEntity userStatistics){
		userStatisticsDao.save(userStatistics);
	}
	
	@Override
	public void update(UserStatisticsEntity userStatistics){
		userStatisticsDao.updatee(userStatistics);
	}
	
	@Override
	public void delete(Long id){
		userStatisticsDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		userStatisticsDao.deleteBatch(ids);
	}
	
}
