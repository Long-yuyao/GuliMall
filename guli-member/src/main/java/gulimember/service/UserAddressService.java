package gulimember.service;

import gulimember.entity.UserAddressEntity;

import java.util.List;
import java.util.Map;

/**
 * 收货地址表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
public interface UserAddressService {
	
	UserAddressEntity queryObject(Long id);
	
	List<UserAddressEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserAddressEntity userAddress);
	
	void update(UserAddressEntity userAddress);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
