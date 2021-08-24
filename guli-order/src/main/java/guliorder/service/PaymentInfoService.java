package guliorder.service;

import guliorder.entity.PaymentInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * 支付信息表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public interface PaymentInfoService {
	
	PaymentInfoEntity queryObject(Long id);
	
	List<PaymentInfoEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(PaymentInfoEntity paymentInfo);
	
	void update(PaymentInfoEntity paymentInfo);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
