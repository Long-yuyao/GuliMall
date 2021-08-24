package gulicoupon.service;
import gulicoupon.entity.SkuFullReductionEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品满减信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public interface SkuFullReductionService {
	
	SkuFullReductionEntity queryObject(Long id);
	
	List<SkuFullReductionEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SkuFullReductionEntity skuFullReduction);
	
	void update(SkuFullReductionEntity skuFullReduction);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
