package gulistorage.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulistorage.entity.WareSkuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

    WareSkuEntity queryObject(Long id);

    List<WareSkuEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(WareSkuEntity wareSku);

    void updatee(WareSkuEntity wareSku);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
