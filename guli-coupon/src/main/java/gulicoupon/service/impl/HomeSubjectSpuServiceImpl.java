package gulicoupon.service.impl;

import gulicoupon.dao.HomeSubjectSpuDao;
import gulicoupon.entity.HomeSubjectSpuEntity;
import gulicoupon.service.HomeSubjectSpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("homeSubjectSpuService")
public class HomeSubjectSpuServiceImpl implements HomeSubjectSpuService {
	@Autowired
	private HomeSubjectSpuDao homeSubjectSpuDao;
	
	@Override
	public HomeSubjectSpuEntity queryObject(Long id){
		return homeSubjectSpuDao.queryObject(id);
	}
	
	@Override
	public List<HomeSubjectSpuEntity> queryList(Map<String, Object> map){
		return homeSubjectSpuDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return homeSubjectSpuDao.queryTotal(map);
	}
	
	@Override
	public void save(HomeSubjectSpuEntity homeSubjectSpu){
		homeSubjectSpuDao.save(homeSubjectSpu);
	}
	
	@Override
	public void update(HomeSubjectSpuEntity homeSubjectSpu){
		homeSubjectSpuDao.coupdate(homeSubjectSpu);
	}
	
	@Override
	public void delete(Long id){
		homeSubjectSpuDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		homeSubjectSpuDao.deleteBatch(ids);
	}
	
}
