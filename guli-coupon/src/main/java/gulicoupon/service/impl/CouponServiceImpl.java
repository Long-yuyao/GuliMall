package gulicoupon.service.impl;

import gulicoupon.dao.CouponDao;
import gulicoupon.entity.CouponEntity;
import gulicoupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("couponService")
public class CouponServiceImpl implements CouponService {
	@Autowired
	private CouponDao couponDao;
	
	@Override
	public CouponEntity queryObject(Long id){
		return couponDao.queryObject(id);
	}
	
	@Override
	public List<CouponEntity> queryList(Map<String, Object> map){
		return couponDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return couponDao.queryTotal(map);
	}
	
	@Override
	public void save(CouponEntity coupon){
		couponDao.save(coupon);
	}
	
	@Override
	public void update(CouponEntity coupon){
		couponDao.coupdate(coupon);
	}
	
	@Override
	public void delete(Long id){
		couponDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		couponDao.deleteBatch(ids);
	}
	
}
