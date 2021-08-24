package gulicoupon.service.impl;

import gulicoupon.dao.SkuFullReductionDao;
import gulicoupon.entity.SkuFullReductionEntity;
import gulicoupon.service.SkuFullReductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;




@Service("skuFullReductionService")
public class SkuFullReductionServiceImpl implements SkuFullReductionService {
	@Autowired
	private SkuFullReductionDao skuFullReductionDao;
	
	@Override
	public SkuFullReductionEntity queryObject(Long id){
		return skuFullReductionDao.queryObject(id);
	}
	
	@Override
	public List<SkuFullReductionEntity> queryList(Map<String, Object> map){
		return skuFullReductionDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return skuFullReductionDao.queryTotal(map);
	}
	
	@Override
	public void save(SkuFullReductionEntity skuFullReduction){
		skuFullReductionDao.save(skuFullReduction);
	}
	
	@Override
	public void update(SkuFullReductionEntity skuFullReduction){
		skuFullReductionDao.coupdate(skuFullReduction);
	}
	
	@Override
	public void delete(Long id){
		skuFullReductionDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		skuFullReductionDao.deleteBatch(ids);
	}
	
}
