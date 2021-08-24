package guliorder.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import guliorder.dao.OrderSettingDao;
import guliorder.entity.OrderSettingEntity;
import guliorder.service.OrderSettingService;



@Service("orderSettingService")
public class OrderSettingServiceImpl implements OrderSettingService {
	@Autowired
	private OrderSettingDao orderSettingDao;
	
	@Override
	public OrderSettingEntity queryObject(Long id){
		return orderSettingDao.queryObject(id);
	}
	
	@Override
	public List<OrderSettingEntity> queryList(Map<String, Object> map){
		return orderSettingDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return orderSettingDao.queryTotal(map);
	}
	
	@Override
	public void save(OrderSettingEntity orderSetting){
		orderSettingDao.save(orderSetting);
	}
	
	@Override
	public void update(OrderSettingEntity orderSetting){
		orderSettingDao.updatee(orderSetting);
	}
	
	@Override
	public void delete(Long id){
		orderSettingDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		orderSettingDao.deleteBatch(ids);
	}
	
}
