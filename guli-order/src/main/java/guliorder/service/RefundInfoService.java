package guliorder.service;

import guliorder.entity.RefundInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * 退款信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
public interface RefundInfoService {
	
	RefundInfoEntity queryObject(Long id);
	
	List<RefundInfoEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(RefundInfoEntity refundInfo);
	
	void update(RefundInfoEntity refundInfo);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
