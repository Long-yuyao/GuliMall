package gulistorage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulistorage.dao.WareSkuDao;
import gulistorage.entity.WareSkuEntity;
import gulistorage.service.WareSkuService;



@Service("wareSkuService")
public class WareSkuServiceImpl implements WareSkuService {
	@Autowired
	private WareSkuDao wareSkuDao;
	
	@Override
	public WareSkuEntity queryObject(Long id){
		return wareSkuDao.queryObject(id);
	}
	
	@Override
	public List<WareSkuEntity> queryList(Map<String, Object> map){
		return wareSkuDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return wareSkuDao.queryTotal(map);
	}
	
	@Override
	public void save(WareSkuEntity wareSku){
		wareSkuDao.save(wareSku);
	}
	
	@Override
	public void update(WareSkuEntity wareSku){
		wareSkuDao.updatee(wareSku);
	}
	
	@Override
	public void delete(Long id){
		wareSkuDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		wareSkuDao.deleteBatch(ids);
	}
	
}
