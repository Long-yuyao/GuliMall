package gulimember.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulimember.dao.IntegrationHistoryDao;
import gulimember.entity.IntegrationHistoryEntity;
import gulimember.service.IntegrationHistoryService;



@Service("integrationHistoryService")
public class IntegrationHistoryServiceImpl implements IntegrationHistoryService {
	@Autowired
	private IntegrationHistoryDao integrationHistoryDao;
	
	@Override
	public IntegrationHistoryEntity queryObject(Long id){
		return integrationHistoryDao.queryObject(id);
	}
	
	@Override
	public List<IntegrationHistoryEntity> queryList(Map<String, Object> map){
		return integrationHistoryDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return integrationHistoryDao.queryTotal(map);
	}
	
	@Override
	public void save(IntegrationHistoryEntity integrationHistory){
		integrationHistoryDao.save(integrationHistory);
	}
	
	@Override
	public void update(IntegrationHistoryEntity integrationHistory){
		integrationHistoryDao.updatee(integrationHistory);
	}
	
	@Override
	public void delete(Long id){
		integrationHistoryDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		integrationHistoryDao.deleteBatch(ids);
	}
	
}
