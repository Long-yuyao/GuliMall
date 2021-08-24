package guliorder.service;

import guliorder.entity.OrderReturnApplyEntity;

import java.util.List;
import java.util.Map;

/**
 * 订单退货申请
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public interface OrderReturnApplyService {
	
	OrderReturnApplyEntity queryObject(Long id);
	
	List<OrderReturnApplyEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(OrderReturnApplyEntity orderReturnApply);
	
	void update(OrderReturnApplyEntity orderReturnApply);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
