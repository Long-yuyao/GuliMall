package gulimember.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulimember.dao.UserAddressDao;
import gulimember.entity.UserAddressEntity;
import gulimember.service.UserAddressService;



@Service("userAddressService")
public class UserAddressServiceImpl implements UserAddressService {
	@Autowired
	private UserAddressDao userAddressDao;
	
	@Override
	public UserAddressEntity queryObject(Long id){
		return userAddressDao.queryObject(id);
	}
	
	@Override
	public List<UserAddressEntity> queryList(Map<String, Object> map){
		return userAddressDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return userAddressDao.queryTotal(map);
	}
	
	@Override
	public void save(UserAddressEntity userAddress){
		userAddressDao.save(userAddress);
	}
	
	@Override
	public void update(UserAddressEntity userAddress){
		userAddressDao.updatee(userAddress);
	}
	
	@Override
	public void delete(Long id){
		userAddressDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		userAddressDao.deleteBatch(ids);
	}
	
}
