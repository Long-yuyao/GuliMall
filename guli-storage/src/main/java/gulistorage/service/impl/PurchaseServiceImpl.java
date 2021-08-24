package gulistorage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulistorage.dao.PurchaseDao;
import gulistorage.entity.PurchaseEntity;
import gulistorage.service.PurchaseService;



@Service("purchaseService")
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	private PurchaseDao purchaseDao;
	
	@Override
	public PurchaseEntity queryObject(Long id){
		return purchaseDao.queryObject(id);
	}
	
	@Override
	public List<PurchaseEntity> queryList(Map<String, Object> map){
		return purchaseDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return purchaseDao.queryTotal(map);
	}
	
	@Override
	public void save(PurchaseEntity purchase){
		purchaseDao.save(purchase);
	}
	
	@Override
	public void update(PurchaseEntity purchase){
		purchaseDao.updatee(purchase);
	}
	
	@Override
	public void delete(Long id){
		purchaseDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		purchaseDao.deleteBatch(ids);
	}
	
}
