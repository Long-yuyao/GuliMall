package gulistorage.service;

import gulistorage.entity.WareEntity;

import java.util.List;
import java.util.Map;

/**
 * 仓库信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
public interface WareService {
	
	WareEntity queryObject(Long id);
	
	List<WareEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(WareEntity ware);
	
	void update(WareEntity ware);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
