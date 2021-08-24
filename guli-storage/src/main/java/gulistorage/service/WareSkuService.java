package gulistorage.service;

import gulistorage.entity.WareSkuEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
public interface WareSkuService {
	
	WareSkuEntity queryObject(Long id);
	
	List<WareSkuEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(WareSkuEntity wareSku);
	
	void update(WareSkuEntity wareSku);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
