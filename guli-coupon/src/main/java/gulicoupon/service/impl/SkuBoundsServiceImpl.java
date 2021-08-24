package gulicoupon.service.impl;

import gulicoupon.dao.SkuBoundsDao;
import gulicoupon.entity.SkuBoundsEntity;
import gulicoupon.service.SkuBoundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("skuBoundsService")
public class SkuBoundsServiceImpl implements SkuBoundsService {
	@Autowired
	private SkuBoundsDao skuBoundsDao;
	
	@Override
	public SkuBoundsEntity queryObject(Long id){
		return skuBoundsDao.queryObject(id);
	}
	
	@Override
	public List<SkuBoundsEntity> queryList(Map<String, Object> map){
		return skuBoundsDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return skuBoundsDao.queryTotal(map);
	}
	
	@Override
	public void save(SkuBoundsEntity skuBounds){
		skuBoundsDao.save(skuBounds);
	}
	
	@Override
	public void update(SkuBoundsEntity skuBounds){
		skuBoundsDao.coupdate(skuBounds);
	}
	
	@Override
	public void delete(Long id){
		skuBoundsDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		skuBoundsDao.deleteBatch(ids);
	}
	
}
