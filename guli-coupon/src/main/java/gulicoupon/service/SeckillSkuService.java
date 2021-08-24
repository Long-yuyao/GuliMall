package gulicoupon.service;
import gulicoupon.entity.SeckillSkuEntity;

import java.util.List;
import java.util.Map;

/**
 * 秒杀活动商品关联
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public interface SeckillSkuService {
	
	SeckillSkuEntity queryObject(Long id);
	
	List<SeckillSkuEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SeckillSkuEntity seckillSku);
	
	void update(SeckillSkuEntity seckillSku);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
