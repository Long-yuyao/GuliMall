package gulimember.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulimember.dao.UserCollectSkuDao;
import gulimember.entity.UserCollectSkuEntity;
import gulimember.service.UserCollectSkuService;



@Service("userCollectSkuService")
public class UserCollectSkuServiceImpl implements UserCollectSkuService {
	@Autowired
	private UserCollectSkuDao userCollectSkuDao;
	
	@Override
	public UserCollectSkuEntity queryObject(Long id){
		return userCollectSkuDao.queryObject(id);
	}
	
	@Override
	public List<UserCollectSkuEntity> queryList(Map<String, Object> map){
		return userCollectSkuDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return userCollectSkuDao.queryTotal(map);
	}
	
	@Override
	public void save(UserCollectSkuEntity userCollectSku){
		userCollectSkuDao.save(userCollectSku);
	}
	
	@Override
	public void update(UserCollectSkuEntity userCollectSku){
		userCollectSkuDao.updatee(userCollectSku);
	}
	
	@Override
	public void delete(Long id){
		userCollectSkuDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		userCollectSkuDao.deleteBatch(ids);
	}
	
}
