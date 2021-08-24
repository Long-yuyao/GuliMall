package gulimember.service;

import gulimember.entity.IntegrationHistoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 购物积分记录表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public interface IntegrationHistoryService {
	
	IntegrationHistoryEntity queryObject(Long id);
	
	List<IntegrationHistoryEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(IntegrationHistoryEntity integrationHistory);
	
	void update(IntegrationHistoryEntity integrationHistory);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
