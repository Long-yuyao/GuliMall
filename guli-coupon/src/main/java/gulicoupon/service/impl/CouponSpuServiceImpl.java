package gulicoupon.service.impl;

import gulicoupon.dao.CouponSpuDao;
import gulicoupon.entity.CouponSpuEntity;
import gulicoupon.service.CouponSpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("couponSpuService")
public class CouponSpuServiceImpl implements CouponSpuService {
	@Autowired
	private CouponSpuDao couponSpuDao;
	
	@Override
	public CouponSpuEntity queryObject(Long id){
		return couponSpuDao.queryObject(id);
	}
	
	@Override
	public List<CouponSpuEntity> queryList(Map<String, Object> map){
		return couponSpuDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return couponSpuDao.queryTotal(map);
	}
	
	@Override
	public void save(CouponSpuEntity couponSpu){
		couponSpuDao.save(couponSpu);
	}
	
	@Override
	public void update(CouponSpuEntity couponSpu){
		couponSpuDao.coupdate(couponSpu);
	}
	
	@Override
	public void delete(Long id){
		couponSpuDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		couponSpuDao.deleteBatch(ids);
	}
	
}
