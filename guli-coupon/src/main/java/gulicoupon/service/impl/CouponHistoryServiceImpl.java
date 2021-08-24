package gulicoupon.service.impl;

import gulicoupon.dao.CouponHistoryDao;
import gulicoupon.entity.CouponHistoryEntity;
import gulicoupon.service.CouponHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("couponHistoryService")
public class CouponHistoryServiceImpl implements CouponHistoryService {
	@Autowired
	private CouponHistoryDao couponHistoryDao;
	
	@Override
	public CouponHistoryEntity queryObject(Long id){
		return couponHistoryDao.queryObject(id);
	}
	
	@Override
	public List<CouponHistoryEntity> queryList(Map<String, Object> map){
		return couponHistoryDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return couponHistoryDao.queryTotal(map);
	}
	
	@Override
	public void save(CouponHistoryEntity couponHistory){
		couponHistoryDao.save(couponHistory);
	}
	
	@Override
	public void update(CouponHistoryEntity couponHistory){
		couponHistoryDao.coupdate(couponHistory);
	}
	
	@Override
	public void delete(Long id){
		couponHistoryDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		couponHistoryDao.deleteBatch(ids);
	}
	
}
