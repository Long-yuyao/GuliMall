package gulicoupon.service;
import gulicoupon.entity.CouponSpuCategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 优惠券分类关联
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public interface CouponSpuCategoryService {
	
	CouponSpuCategoryEntity queryObject(Long id);
	
	List<CouponSpuCategoryEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(CouponSpuCategoryEntity couponSpuCategory);
	
	void update(CouponSpuCategoryEntity couponSpuCategory);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
