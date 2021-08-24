package guliorder.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import guliorder.dao.OrderItemDao;
import guliorder.entity.OrderItemEntity;
import guliorder.service.OrderItemService;



@Service("orderItemService")
public class OrderItemServiceImpl implements OrderItemService {
	@Autowired
	private OrderItemDao orderItemDao;
	
	@Override
	public OrderItemEntity queryObject(Long id){
		return orderItemDao.queryObject(id);
	}
	
	@Override
	public List<OrderItemEntity> queryList(Map<String, Object> map){
		return orderItemDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return orderItemDao.queryTotal(map);
	}
	
	@Override
	public void save(OrderItemEntity orderItem){
		orderItemDao.save(orderItem);
	}
	
	@Override
	public void update(OrderItemEntity orderItem){
		orderItemDao.updatee(orderItem);
	}
	
	@Override
	public void delete(Long id){
		orderItemDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		orderItemDao.deleteBatch(ids);
	}
	
}
