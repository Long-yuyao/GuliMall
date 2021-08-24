package guliorder.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import guliorder.dao.OrderDao;
import guliorder.entity.OrderEntity;
import guliorder.service.OrderService;



@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao orderDao;
	
	@Override
	public OrderEntity queryObject(Long id){
		return orderDao.queryObject(id);
	}
	
	@Override
	public List<OrderEntity> queryList(Map<String, Object> map){
		return orderDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return orderDao.queryTotal(map);
	}
	
	@Override
	public void save(OrderEntity order){
		orderDao.save(order);
	}
	
	@Override
	public void update(OrderEntity order){
		orderDao.updatee(order);
	}
	
	@Override
	public void delete(Long id){
		orderDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		orderDao.deleteBatch(ids);
	}
	
}
