package gulistorage.service;

import gulistorage.entity.PurchaseDetailEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
public interface PurchaseDetailService {
	
	PurchaseDetailEntity queryObject(Long id);
	
	List<PurchaseDetailEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(PurchaseDetailEntity purchaseDetail);
	
	void update(PurchaseDetailEntity purchaseDetail);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
