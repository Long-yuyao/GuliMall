package guliorder.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import guliorder.dao.OrderReturnApplyDao;
import guliorder.entity.OrderReturnApplyEntity;
import guliorder.service.OrderReturnApplyService;



@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl implements OrderReturnApplyService {
	@Autowired
	private OrderReturnApplyDao orderReturnApplyDao;
	
	@Override
	public OrderReturnApplyEntity queryObject(Long id){
		return orderReturnApplyDao.queryObject(id);
	}
	
	@Override
	public List<OrderReturnApplyEntity> queryList(Map<String, Object> map){
		return orderReturnApplyDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return orderReturnApplyDao.queryTotal(map);
	}
	
	@Override
	public void save(OrderReturnApplyEntity orderReturnApply){
		orderReturnApplyDao.save(orderReturnApply);
	}
	
	@Override
	public void update(OrderReturnApplyEntity orderReturnApply){
		orderReturnApplyDao.updatee(orderReturnApply);
	}
	
	@Override
	public void delete(Long id){
		orderReturnApplyDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		orderReturnApplyDao.deleteBatch(ids);
	}
	
}
