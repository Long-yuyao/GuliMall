package gulimember.service;

import gulimember.entity.UserEntity;

import java.util.List;
import java.util.Map;

/**
 * 用户表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public interface UserService {
	
	UserEntity queryObject(Long id);
	
	List<UserEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserEntity user);
	
	void update(UserEntity user);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
