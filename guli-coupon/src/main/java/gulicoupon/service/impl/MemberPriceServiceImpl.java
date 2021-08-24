package gulicoupon.service.impl;

import gulicoupon.dao.MemberPriceDao;
import gulicoupon.entity.MemberPriceEntity;
import gulicoupon.service.MemberPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("memberPriceService")
public class MemberPriceServiceImpl implements MemberPriceService {
	@Autowired
	private MemberPriceDao memberPriceDao;
	
	@Override
	public MemberPriceEntity queryObject(Long id){
		return memberPriceDao.queryObject(id);
	}
	
	@Override
	public List<MemberPriceEntity> queryList(Map<String, Object> map){
		return memberPriceDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return memberPriceDao.queryTotal(map);
	}
	
	@Override
	public void save(MemberPriceEntity memberPrice){
		memberPriceDao.save(memberPrice);
	}
	
	@Override
	public void update(MemberPriceEntity memberPrice){
		memberPriceDao.coupdate(memberPrice);
	}
	
	@Override
	public void delete(Long id){
		memberPriceDao.codelete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		memberPriceDao.deleteBatch(ids);
	}
	
}
