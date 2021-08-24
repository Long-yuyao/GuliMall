package guliorder.service;

import guliorder.entity.OrderEntity;

import java.util.List;
import java.util.Map;

/**
 * 订单
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public interface OrderService {
	
	OrderEntity queryObject(Long id);
	
	List<OrderEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(OrderEntity order);
	
	void update(OrderEntity order);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
