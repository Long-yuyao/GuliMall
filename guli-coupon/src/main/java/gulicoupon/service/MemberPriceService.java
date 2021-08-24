package gulicoupon.service;
import gulicoupon.entity.MemberPriceEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品会员价格
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public interface MemberPriceService {
	
	MemberPriceEntity queryObject(Long id);
	
	List<MemberPriceEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(MemberPriceEntity memberPrice);
	
	void update(MemberPriceEntity memberPrice);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
