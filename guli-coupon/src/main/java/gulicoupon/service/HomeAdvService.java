package gulicoupon.service;
import gulicoupon.entity.HomeAdvEntity;

import java.util.List;
import java.util.Map;

/**
 * 首页轮播广告
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public interface HomeAdvService {
	
	HomeAdvEntity queryObject(Long id);
	
	List<HomeAdvEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(HomeAdvEntity homeAdv);
	
	void update(HomeAdvEntity homeAdv);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
