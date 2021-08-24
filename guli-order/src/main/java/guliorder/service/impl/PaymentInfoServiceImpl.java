package guliorder.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import guliorder.dao.PaymentInfoDao;
import guliorder.entity.PaymentInfoEntity;
import guliorder.service.PaymentInfoService;



@Service("paymentInfoService")
public class PaymentInfoServiceImpl implements PaymentInfoService {
	@Autowired
	private PaymentInfoDao paymentInfoDao;
	
	@Override
	public PaymentInfoEntity queryObject(Long id){
		return paymentInfoDao.queryObject(id);
	}
	
	@Override
	public List<PaymentInfoEntity> queryList(Map<String, Object> map){
		return paymentInfoDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return paymentInfoDao.queryTotal(map);
	}
	
	@Override
	public void save(PaymentInfoEntity paymentInfo){
		paymentInfoDao.save(paymentInfo);
	}
	
	@Override
	public void update(PaymentInfoEntity paymentInfo){
		paymentInfoDao.updatee(paymentInfo);
	}
	
	@Override
	public void delete(Long id){
		paymentInfoDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		paymentInfoDao.deleteBatch(ids);
	}
	
}
