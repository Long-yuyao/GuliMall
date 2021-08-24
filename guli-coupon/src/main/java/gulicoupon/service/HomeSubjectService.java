package gulicoupon.service;
import gulicoupon.entity.HomeSubjectEntity;

import java.util.List;
import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public interface HomeSubjectService {
	
	HomeSubjectEntity queryObject(Long id);
	
	List<HomeSubjectEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(HomeSubjectEntity homeSubject);
	
	void update(HomeSubjectEntity homeSubject);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
