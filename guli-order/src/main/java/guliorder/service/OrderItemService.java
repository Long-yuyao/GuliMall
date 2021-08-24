package guliorder.service;

import guliorder.entity.OrderItemEntity;

import java.util.List;
import java.util.Map;

/**
 * 订单项信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public interface OrderItemService {
	
	OrderItemEntity queryObject(Long id);
	
	List<OrderItemEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(OrderItemEntity orderItem);
	
	void update(OrderItemEntity orderItem);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
