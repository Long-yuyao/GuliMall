package gulistorage.service;

import gulistorage.entity.PurchaseEntity;

import java.util.List;
import java.util.Map;

/**
 * 采购信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
public interface PurchaseService {
	
	PurchaseEntity queryObject(Long id);
	
	List<PurchaseEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(PurchaseEntity purchase);
	
	void update(PurchaseEntity purchase);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
