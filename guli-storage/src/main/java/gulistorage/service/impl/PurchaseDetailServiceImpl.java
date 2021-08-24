package gulistorage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulistorage.dao.PurchaseDetailDao;
import gulistorage.entity.PurchaseDetailEntity;
import gulistorage.service.PurchaseDetailService;



@Service("purchaseDetailService")
public class PurchaseDetailServiceImpl implements PurchaseDetailService {
	@Autowired
	private PurchaseDetailDao purchaseDetailDao;
	
	@Override
	public PurchaseDetailEntity queryObject(Long id){
		return purchaseDetailDao.queryObject(id);
	}
	
	@Override
	public List<PurchaseDetailEntity> queryList(Map<String, Object> map){
		return purchaseDetailDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return purchaseDetailDao.queryTotal(map);
	}
	
	@Override
	public void save(PurchaseDetailEntity purchaseDetail){
		purchaseDetailDao.save(purchaseDetail);
	}
	
	@Override
	public void update(PurchaseDetailEntity purchaseDetail){
		purchaseDetailDao.updatee(purchaseDetail);
	}
	
	@Override
	public void delete(Long id){
		purchaseDetailDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		purchaseDetailDao.deleteBatch(ids);
	}
	
}
