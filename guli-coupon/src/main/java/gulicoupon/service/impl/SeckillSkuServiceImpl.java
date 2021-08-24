package gulicoupon.service.impl;

import gulicoupon.dao.SeckillSkuDao;
import gulicoupon.entity.SeckillSkuEntity;
import gulicoupon.service.SeckillSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;




@Service("seckillSkuService")
public class SeckillSkuServiceImpl implements SeckillSkuService {
	@Autowired
	private SeckillSkuDao seckillSkuDao;
	
	@Override
	public SeckillSkuEntity queryObject(Long id){
		return seckillSkuDao.queryObject(id);
	}
	
	@Override
	public List<SeckillSkuEntity> queryList(Map<String, Object> map){
		return seckillSkuDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return seckillSkuDao.queryTotal(map);
	}
	
	@Override
	public void save(SeckillSkuEntity seckillSku){
		seckillSkuDao.save(seckillSku);
	}
	
	@Override
	public void update(SeckillSkuEntity seckillSku){
		seckillSkuDao.coupdate(seckillSku);
	}
	
	@Override
	public void delete(Long id){
		seckillSkuDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		seckillSkuDao.deleteBatch(ids);
	}
	
}
