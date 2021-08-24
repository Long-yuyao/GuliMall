package gulicoupon.service;
import gulicoupon.entity.CouponSpuEntity;

import java.util.List;
import java.util.Map;

/**
 * 优惠券与产品关联
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public interface CouponSpuService {
	
	CouponSpuEntity queryObject(Long id);
	
	List<CouponSpuEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(CouponSpuEntity couponSpu);
	
	void update(CouponSpuEntity couponSpu);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
