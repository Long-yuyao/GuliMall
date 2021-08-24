package gulicoupon.service.impl;

import gulicoupon.dao.SeckillPromotionDao;
import gulicoupon.entity.SeckillPromotionEntity;
import gulicoupon.service.SeckillPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;




@Service("seckillPromotionService")
public class SeckillPromotionServiceImpl implements SeckillPromotionService {
	@Autowired
	private SeckillPromotionDao seckillPromotionDao;
	
	@Override
	public SeckillPromotionEntity queryObject(Long id){
		return seckillPromotionDao.queryObject(id);
	}
	
	@Override
	public List<SeckillPromotionEntity> queryList(Map<String, Object> map){
		return seckillPromotionDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return seckillPromotionDao.queryTotal(map);
	}
	
	@Override
	public void save(SeckillPromotionEntity seckillPromotion){
		seckillPromotionDao.save(seckillPromotion);
	}
	
	@Override
	public void update(SeckillPromotionEntity seckillPromotion){
		seckillPromotionDao.coupdate(seckillPromotion);
	}
	
	@Override
	public void delete(Long id){
		seckillPromotionDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		seckillPromotionDao.deleteBatch(ids);
	}
	
}
