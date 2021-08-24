package gulicoupon.service.impl;

import gulicoupon.dao.SeckillSessionDao;
import gulicoupon.entity.SeckillSessionEntity;
import gulicoupon.service.SeckillSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service("seckillSessionService")
public class SeckillSessionServiceImpl implements SeckillSessionService {
	@Autowired
	private SeckillSessionDao seckillSessionDao;
	
	@Override
	public SeckillSessionEntity queryObject(Long id){
		return seckillSessionDao.queryObject(id);
	}
	
	@Override
	public List<SeckillSessionEntity> queryList(Map<String, Object> map){
		return seckillSessionDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return seckillSessionDao.queryTotal(map);
	}
	
	@Override
	public void save(SeckillSessionEntity seckillSession){
		seckillSessionDao.save(seckillSession);
	}
	
	@Override
	public void update(SeckillSessionEntity seckillSession){
		seckillSessionDao.coupdate(seckillSession);
	}
	
	@Override
	public void delete(Long id){
		seckillSessionDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		seckillSessionDao.deleteBatch(ids);
	}
	
}
