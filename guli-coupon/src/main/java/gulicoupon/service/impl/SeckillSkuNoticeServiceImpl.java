package gulicoupon.service.impl;

import gulicoupon.dao.SeckillSkuNoticeDao;
import gulicoupon.entity.SeckillSkuNoticeEntity;
import gulicoupon.service.SeckillSkuNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("seckillSkuNoticeService")
public class SeckillSkuNoticeServiceImpl implements SeckillSkuNoticeService {
	@Autowired
	private SeckillSkuNoticeDao seckillSkuNoticeDao;
	
	@Override
	public SeckillSkuNoticeEntity queryObject(Long id){
		return seckillSkuNoticeDao.queryObject(id);
	}
	
	@Override
	public List<SeckillSkuNoticeEntity> queryList(Map<String, Object> map){
		return seckillSkuNoticeDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return seckillSkuNoticeDao.queryTotal(map);
	}
	
	@Override
	public void save(SeckillSkuNoticeEntity seckillSkuNotice){
		seckillSkuNoticeDao.save(seckillSkuNotice);
	}
	
	@Override
	public void update(SeckillSkuNoticeEntity seckillSkuNotice){
		seckillSkuNoticeDao.coupdate(seckillSkuNotice);
	}
	
	@Override
	public void delete(Long id){
		seckillSkuNoticeDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		seckillSkuNoticeDao.deleteBatch(ids);
	}
	
}
