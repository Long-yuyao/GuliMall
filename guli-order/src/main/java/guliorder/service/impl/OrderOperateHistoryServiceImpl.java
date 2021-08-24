package guliorder.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import guliorder.dao.OrderOperateHistoryDao;
import guliorder.entity.OrderOperateHistoryEntity;
import guliorder.service.OrderOperateHistoryService;



@Service("orderOperateHistoryService")
public class OrderOperateHistoryServiceImpl implements OrderOperateHistoryService {
	@Autowired
	private OrderOperateHistoryDao orderOperateHistoryDao;
	
	@Override
	public OrderOperateHistoryEntity queryObject(Long id){
		return orderOperateHistoryDao.queryObject(id);
	}
	
	@Override
	public List<OrderOperateHistoryEntity> queryList(Map<String, Object> map){
		return orderOperateHistoryDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return orderOperateHistoryDao.queryTotal(map);
	}
	
	@Override
	public void save(OrderOperateHistoryEntity orderOperateHistory){
		orderOperateHistoryDao.save(orderOperateHistory);
	}
	
	@Override
	public void update(OrderOperateHistoryEntity orderOperateHistory){
		orderOperateHistoryDao.updatee(orderOperateHistory);
	}
	
	@Override
	public void delete(Long id){
		orderOperateHistoryDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		orderOperateHistoryDao.deleteBatch(ids);
	}
	
}
