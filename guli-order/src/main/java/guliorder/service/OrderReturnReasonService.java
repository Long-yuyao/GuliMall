package guliorder.service;

import guliorder.entity.OrderReturnReasonEntity;

import java.util.List;
import java.util.Map;

/**
 * 退货原因
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public interface OrderReturnReasonService {
	
	OrderReturnReasonEntity queryObject(Long id);
	
	List<OrderReturnReasonEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(OrderReturnReasonEntity orderReturnReason);
	
	void update(OrderReturnReasonEntity orderReturnReason);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
