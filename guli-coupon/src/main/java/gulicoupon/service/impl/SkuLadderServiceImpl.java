package gulicoupon.service.impl;

import gulicoupon.dao.SkuLadderDao;
import gulicoupon.entity.SkuLadderEntity;
import gulicoupon.service.SkuLadderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("skuLadderService")
public class SkuLadderServiceImpl implements SkuLadderService {
	@Autowired
	private SkuLadderDao skuLadderDao;
	
	@Override
	public SkuLadderEntity queryObject(Long id){
		return skuLadderDao.queryObject(id);
	}
	
	@Override
	public List<SkuLadderEntity> queryList(Map<String, Object> map){
		return skuLadderDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return skuLadderDao.queryTotal(map);
	}
	
	@Override
	public void save(SkuLadderEntity skuLadder){
		skuLadderDao.save(skuLadder);
	}
	
	@Override
	public void update(SkuLadderEntity skuLadder){
		skuLadderDao.coupdate(skuLadder);
	}
	
	@Override
	public void delete(Long id){
		skuLadderDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		skuLadderDao.deleteBatch(ids);
	}
	
}
