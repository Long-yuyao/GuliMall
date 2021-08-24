package gulimember.service;

import gulimember.entity.UserCollectShopEntity;

import java.util.List;
import java.util.Map;

/**
 * 关注店铺表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public interface UserCollectShopService {
	
	UserCollectShopEntity queryObject(Long id);
	
	List<UserCollectShopEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserCollectShopEntity userCollectShop);
	
	void update(UserCollectShopEntity userCollectShop);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
