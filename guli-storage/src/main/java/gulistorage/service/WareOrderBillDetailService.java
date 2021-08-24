package gulistorage.service;

import gulistorage.entity.WareOrderBillDetailEntity;

import java.util.List;
import java.util.Map;

/**
 * 库存工作单
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
public interface WareOrderBillDetailService {
	
	WareOrderBillDetailEntity queryObject(Long id);
	
	List<WareOrderBillDetailEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(WareOrderBillDetailEntity wareOrderBillDetail);
	
	void update(WareOrderBillDetailEntity wareOrderBillDetail);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
