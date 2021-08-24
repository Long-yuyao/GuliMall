package gulicoupon.service;
import gulicoupon.entity.HomeSubjectSpuEntity;

import java.util.List;
import java.util.Map;

/**
 * 专题商品
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public interface HomeSubjectSpuService {
	
	HomeSubjectSpuEntity queryObject(Long id);
	
	List<HomeSubjectSpuEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(HomeSubjectSpuEntity homeSubjectSpu);
	
	void update(HomeSubjectSpuEntity homeSubjectSpu);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
