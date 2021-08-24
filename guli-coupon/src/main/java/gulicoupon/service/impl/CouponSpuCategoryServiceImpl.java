package gulicoupon.service.impl;

import gulicoupon.dao.CouponSpuCategoryDao;
import gulicoupon.entity.CouponSpuCategoryEntity;
import gulicoupon.service.CouponSpuCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("couponSpuCategoryService")
public class CouponSpuCategoryServiceImpl implements CouponSpuCategoryService {
	@Autowired
	private CouponSpuCategoryDao couponSpuCategoryDao;
	
	@Override
	public CouponSpuCategoryEntity queryObject(Long id){
		return couponSpuCategoryDao.queryObject(id);
	}
	
	@Override
	public List<CouponSpuCategoryEntity> queryList(Map<String, Object> map){
		return couponSpuCategoryDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return couponSpuCategoryDao.queryTotal(map);
	}
	
	@Override
	public void save(CouponSpuCategoryEntity couponSpuCategory){
		couponSpuCategoryDao.save(couponSpuCategory);
	}
	
	@Override
	public void update(CouponSpuCategoryEntity couponSpuCategory){
		couponSpuCategoryDao.coupdate(couponSpuCategory);
	}
	
	@Override
	public void delete(Long id){
		couponSpuCategoryDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		couponSpuCategoryDao.deleteBatch(ids);
	}
	
}
