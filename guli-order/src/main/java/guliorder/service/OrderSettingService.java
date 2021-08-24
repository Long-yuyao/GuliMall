package guliorder.service;

import guliorder.entity.OrderSettingEntity;

import java.util.List;
import java.util.Map;

/**
 * 订单配置信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public interface OrderSettingService {
	
	OrderSettingEntity queryObject(Long id);
	
	List<OrderSettingEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(OrderSettingEntity orderSetting);
	
	void update(OrderSettingEntity orderSetting);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
