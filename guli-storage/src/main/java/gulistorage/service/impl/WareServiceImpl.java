package gulistorage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulistorage.dao.WareDao;
import gulistorage.entity.WareEntity;
import gulistorage.service.WareService;



@Service("wareService")
public class WareServiceImpl implements WareService {
	@Autowired
	private WareDao wareDao;
	
	@Override
	public WareEntity queryObject(Long id){
		return wareDao.queryObject(id);
	}
	
	@Override
	public List<WareEntity> queryList(Map<String, Object> map){
		return wareDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return wareDao.queryTotal(map);
	}
	
	@Override
	public void save(WareEntity ware){
		wareDao.save(ware);
	}
	
	@Override
	public void update(WareEntity ware){
		wareDao.updatee(ware);
	}
	
	@Override
	public void delete(Long id){
		wareDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		wareDao.deleteBatch(ids);
	}
	
}
