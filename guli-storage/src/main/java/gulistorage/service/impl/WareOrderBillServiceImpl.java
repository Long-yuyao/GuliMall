package gulistorage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import gulistorage.dao.WareOrderBillDao;
import gulistorage.entity.WareOrderBillEntity;
import gulistorage.service.WareOrderBillService;



@Service("wareOrderBillService")
public class WareOrderBillServiceImpl implements WareOrderBillService {
	@Autowired
	private WareOrderBillDao wareOrderBillDao;
	
	@Override
	public WareOrderBillEntity queryObject(Long id){
		return wareOrderBillDao.queryObject(id);
	}
	
	@Override
	public List<WareOrderBillEntity> queryList(Map<String, Object> map){
		return wareOrderBillDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return wareOrderBillDao.queryTotal(map);
	}
	
	@Override
	public void save(WareOrderBillEntity wareOrderBill){
		wareOrderBillDao.save(wareOrderBill);
	}
	
	@Override
	public void update(WareOrderBillEntity wareOrderBill){
		wareOrderBillDao.updatee(wareOrderBill);
	}
	
	@Override
	public void delete(Long id){
		wareOrderBillDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		wareOrderBillDao.deleteBatch(ids);
	}
	
}
