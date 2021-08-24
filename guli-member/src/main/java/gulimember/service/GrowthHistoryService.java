package gulimember.service;

import gulimember.entity.GrowthHistoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 成长积分记录表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:42:59
 */
public interface GrowthHistoryService {
	
	GrowthHistoryEntity queryObject(Long id);
	
	List<GrowthHistoryEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(GrowthHistoryEntity growthHistory);
	
	void update(GrowthHistoryEntity growthHistory);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
