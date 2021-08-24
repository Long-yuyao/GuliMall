package gulicoupon.service;

import gulicoupon.entity.CouponHistoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 优惠券领取历史记录
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public interface CouponHistoryService {
	
	CouponHistoryEntity queryObject(Long id);
	
	List<CouponHistoryEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(CouponHistoryEntity couponHistory);
	
	void update(CouponHistoryEntity couponHistory);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
