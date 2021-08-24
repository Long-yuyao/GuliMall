package guliorder.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import guliorder.dao.OrderReturnReasonDao;
import guliorder.entity.OrderReturnReasonEntity;
import guliorder.service.OrderReturnReasonService;



@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl implements OrderReturnReasonService {
	@Autowired
	private OrderReturnReasonDao orderReturnReasonDao;
	
	@Override
	public OrderReturnReasonEntity queryObject(Long id){
		return orderReturnReasonDao.queryObject(id);
	}
	
	@Override
	public List<OrderReturnReasonEntity> queryList(Map<String, Object> map){
		return orderReturnReasonDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return orderReturnReasonDao.queryTotal(map);
	}
	
	@Override
	public void save(OrderReturnReasonEntity orderReturnReason){
		orderReturnReasonDao.save(orderReturnReason);
	}
	
	@Override
	public void update(OrderReturnReasonEntity orderReturnReason){
		orderReturnReasonDao.updatee(orderReturnReason);
	}
	
	@Override
	public void delete(Long id){
		orderReturnReasonDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		orderReturnReasonDao.deleteBatch(ids);
	}
	
}
