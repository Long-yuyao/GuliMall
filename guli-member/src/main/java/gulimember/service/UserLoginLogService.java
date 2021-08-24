package gulimember.service;

import gulimember.entity.UserLoginLogEntity;

import java.util.List;
import java.util.Map;

/**
 * 用户登陆记录表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public interface UserLoginLogService {
	
	UserLoginLogEntity queryObject(Long id);
	
	List<UserLoginLogEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserLoginLogEntity userLoginLog);
	
	void update(UserLoginLogEntity userLoginLog);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
