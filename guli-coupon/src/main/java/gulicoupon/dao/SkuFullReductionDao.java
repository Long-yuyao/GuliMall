package gulicoupon.dao;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulicoupon.entity.SkuFullReductionEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 商品满减信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@Mapper
public interface SkuFullReductionDao extends BaseMapper<SkuFullReductionEntity> {

    SkuFullReductionEntity queryObject(Long id);

    List<SkuFullReductionEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(SkuFullReductionEntity skuFullReduction);

    void coupdate(SkuFullReductionEntity skuFullReduction);

    void codelete(Long id);

    void deleteBatch(Long[] ids);
}
