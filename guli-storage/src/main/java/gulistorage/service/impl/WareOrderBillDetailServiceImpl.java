package gulistorage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulistorage.dao.WareOrderBillDetailDao;
import gulistorage.entity.WareOrderBillDetailEntity;
import gulistorage.service.WareOrderBillDetailService;



@Service("wareOrderBillDetailService")
public class WareOrderBillDetailServiceImpl implements WareOrderBillDetailService {
	@Autowired
	private WareOrderBillDetailDao wareOrderBillDetailDao;
	
	@Override
	public WareOrderBillDetailEntity queryObject(Long id){
		return wareOrderBillDetailDao.queryObject(id);
	}
	
	@Override
	public List<WareOrderBillDetailEntity> queryList(Map<String, Object> map){
		return wareOrderBillDetailDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return wareOrderBillDetailDao.queryTotal(map);
	}
	
	@Override
	public void save(WareOrderBillDetailEntity wareOrderBillDetail){
		wareOrderBillDetailDao.save(wareOrderBillDetail);
	}
	
	@Override
	public void update(WareOrderBillDetailEntity wareOrderBillDetail){
		wareOrderBillDetailDao.updatee(wareOrderBillDetail);
	}
	
	@Override
	public void delete(Long id){
		wareOrderBillDetailDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		wareOrderBillDetailDao.deleteBatch(ids);
	}
	
}
