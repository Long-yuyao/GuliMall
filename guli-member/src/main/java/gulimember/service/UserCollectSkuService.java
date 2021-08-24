package gulimember.service;

import gulimember.entity.UserCollectSkuEntity;

import java.util.List;
import java.util.Map;

/**
 * 关注商品表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public interface UserCollectSkuService {
	
	UserCollectSkuEntity queryObject(Long id);
	
	List<UserCollectSkuEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserCollectSkuEntity userCollectSku);
	
	void update(UserCollectSkuEntity userCollectSku);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
