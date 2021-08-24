package gulimember.service;

import gulimember.entity.UserLevelEntity;

import java.util.List;
import java.util.Map;

/**
 * 会员等级表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public interface UserLevelService {
	
	UserLevelEntity queryObject(Long id);
	
	List<UserLevelEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserLevelEntity userLevel);
	
	void update(UserLevelEntity userLevel);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
