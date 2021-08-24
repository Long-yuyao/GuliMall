package guliorder.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import guliorder.dao.RefundInfoDao;
import guliorder.entity.RefundInfoEntity;
import guliorder.service.RefundInfoService;



@Service("refundInfoService")
public class RefundInfoServiceImpl implements RefundInfoService {
	@Autowired
	private RefundInfoDao refundInfoDao;
	
	@Override
	public RefundInfoEntity queryObject(Long id){
		return refundInfoDao.queryObject(id);
	}
	
	@Override
	public List<RefundInfoEntity> queryList(Map<String, Object> map){
		return refundInfoDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return refundInfoDao.queryTotal(map);
	}
	
	@Override
	public void save(RefundInfoEntity refundInfo){
		refundInfoDao.save(refundInfo);
	}
	
	@Override
	public void update(RefundInfoEntity refundInfo){
		refundInfoDao.updatee(refundInfo);
	}
	
	@Override
	public void delete(Long id){
		refundInfoDao.deletee(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		refundInfoDao.deleteBatch(ids);
	}
	
}
