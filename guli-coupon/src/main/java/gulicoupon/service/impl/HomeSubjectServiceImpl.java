package gulicoupon.service.impl;

import gulicoupon.dao.HomeSubjectDao;
import gulicoupon.entity.HomeSubjectEntity;
import gulicoupon.service.HomeSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("homeSubjectService")
public class HomeSubjectServiceImpl implements HomeSubjectService {
	@Autowired
	private HomeSubjectDao homeSubjectDao;
	
	@Override
	public HomeSubjectEntity queryObject(Long id){
		return homeSubjectDao.queryObject(id);
	}
	
	@Override
	public List<HomeSubjectEntity> queryList(Map<String, Object> map){
		return homeSubjectDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return homeSubjectDao.queryTotal(map);
	}
	
	@Override
	public void save(HomeSubjectEntity homeSubject){
		homeSubjectDao.save(homeSubject);
	}
	
	@Override
	public void update(HomeSubjectEntity homeSubject){
		homeSubjectDao.coupdate(homeSubject);
	}
	
	@Override
	public void delete(Long id){
		homeSubjectDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		homeSubjectDao.deleteBatch(ids);
	}
	
}
