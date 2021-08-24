package gulimember.service;

import gulimember.entity.UserStatisticsEntity;

import java.util.List;
import java.util.Map;

/**
 * 统计信息表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public interface UserStatisticsService {
	
	UserStatisticsEntity queryObject(Long id);
	
	List<UserStatisticsEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserStatisticsEntity userStatistics);
	
	void update(UserStatisticsEntity userStatistics);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
