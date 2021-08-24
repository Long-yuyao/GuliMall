package gulistorage.service;

import gulistorage.entity.WareOrderBillEntity;

import java.util.List;
import java.util.Map;

/**
 * 库存工作单
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
public interface WareOrderBillService {
	
	WareOrderBillEntity queryObject(Long id);
	
	List<WareOrderBillEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(WareOrderBillEntity wareOrderBill);
	
	void update(WareOrderBillEntity wareOrderBill);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
