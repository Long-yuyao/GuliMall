package gulicoupon.service;
import gulicoupon.entity.SkuBoundsEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品spu积分设置
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public interface SkuBoundsService {
	
	SkuBoundsEntity queryObject(Long id);
	
	List<SkuBoundsEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SkuBoundsEntity skuBounds);
	
	void update(SkuBoundsEntity skuBounds);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
