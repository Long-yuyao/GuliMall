package gulimember.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulimember.dao.GrowthHistoryDao;
import gulimember.entity.GrowthHistoryEntity;
import gulimember.service.GrowthHistoryService;



@Service("growthHistoryService")
public class GrowthHistoryServiceImpl implements GrowthHistoryService {
	@Autowired
	private GrowthHistoryDao growthHistoryDao;
	
	@Override
	public GrowthHistoryEntity queryObject(Long id){
		return growthHistoryDao.queryObject(id);
	}
	
	@Override
	public List<GrowthHistoryEntity> queryList(Map<String, Object> map){
		return growthHistoryDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return growthHistoryDao.queryTotal(map);
	}
	
	@Override
	public void save(GrowthHistoryEntity growthHistory){
		growthHistoryDao.save(growthHistory);
	}
	
	@Override
	public void update(GrowthHistoryEntity growthHistory){
		growthHistoryDao.updatee(growthHistory);
	}
	
	@Override
	public void delete(Long id){
		growthHistoryDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		growthHistoryDao.deleteBatch(ids);
	}
	
}
