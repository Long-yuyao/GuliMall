package guliorder.service;

import guliorder.entity.OrderOperateHistoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 订单操作历史记录
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public interface OrderOperateHistoryService {
	
	OrderOperateHistoryEntity queryObject(Long id);
	
	List<OrderOperateHistoryEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(OrderOperateHistoryEntity orderOperateHistory);
	
	void update(OrderOperateHistoryEntity orderOperateHistory);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
