package gulicoupon.service.impl;

import gulicoupon.dao.HomeAdvDao;
import gulicoupon.entity.HomeAdvEntity;
import gulicoupon.service.HomeAdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;




@Service("homeAdvService")
public class HomeAdvServiceImpl implements HomeAdvService {
	@Autowired
	private HomeAdvDao homeAdvDao;
	
	@Override
	public HomeAdvEntity queryObject(Long id){
		return homeAdvDao.queryObject(id);
	}
	
	@Override
	public List<HomeAdvEntity> queryList(Map<String, Object> map){
		return homeAdvDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return homeAdvDao.queryTotal(map);
	}
	
	@Override
	public void save(HomeAdvEntity homeAdv){
		homeAdvDao.save(homeAdv);
	}
	
	@Override
	public void update(HomeAdvEntity homeAdv){
		homeAdvDao.coupdate(homeAdv);
	}
	
	@Override
	public void delete(Long id){
		homeAdvDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		homeAdvDao.deleteBatch(ids);
	}
	
}
