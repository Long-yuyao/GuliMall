package gulicoupon.service;
import gulicoupon.entity.SkuLadderEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品阶梯价格
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public interface SkuLadderService {
	
	SkuLadderEntity queryObject(Long id);
	
	List<SkuLadderEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SkuLadderEntity skuLadder);
	
	void update(SkuLadderEntity skuLadder);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
