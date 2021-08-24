package gulimember.service;

import gulimember.entity.UserCollectSubjectEntity;

import java.util.List;
import java.util.Map;

/**
 * 关注活动表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public interface UserCollectSubjectService {
	
	UserCollectSubjectEntity queryObject(Long id);
	
	List<UserCollectSubjectEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserCollectSubjectEntity userCollectSubject);
	
	void update(UserCollectSubjectEntity userCollectSubject);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
