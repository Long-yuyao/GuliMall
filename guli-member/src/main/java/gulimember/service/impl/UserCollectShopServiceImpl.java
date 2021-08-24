package gulimember.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulimember.dao.UserCollectShopDao;
import gulimember.entity.UserCollectShopEntity;
import gulimember.service.UserCollectShopService;



@Service("userCollectShopService")
public class UserCollectShopServiceImpl implements UserCollectShopService {
	@Autowired
	private UserCollectShopDao userCollectShopDao;
	
	@Override
	public UserCollectShopEntity queryObject(Long id){
		return userCollectShopDao.queryObject(id);
	}
	
	@Override
	public List<UserCollectShopEntity> queryList(Map<String, Object> map){
		return userCollectShopDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return userCollectShopDao.queryTotal(map);
	}
	
	@Override
	public void save(UserCollectShopEntity userCollectShop){
		userCollectShopDao.save(userCollectShop);
	}
	
	@Override
	public void update(UserCollectShopEntity userCollectShop){
		userCollectShopDao.updatee(userCollectShop);
	}
	
	@Override
	public void delete(Long id){
		userCollectShopDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		userCollectShopDao.deleteBatch(ids);
	}
	
}
