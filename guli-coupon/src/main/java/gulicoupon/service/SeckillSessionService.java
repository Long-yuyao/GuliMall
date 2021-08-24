package gulicoupon.service;
import gulicoupon.entity.SeckillSessionEntity;

import java.util.List;
import java.util.Map;

/**
 * 秒杀活动场次
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public interface SeckillSessionService {
	
	SeckillSessionEntity queryObject(Long id);
	
	List<SeckillSessionEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SeckillSessionEntity seckillSession);
	
	void update(SeckillSessionEntity seckillSession);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
