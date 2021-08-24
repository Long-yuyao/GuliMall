package gulicoupon.dao;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulicoupon.entity.SkuBoundsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 商品spu积分设置
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@Mapper
public interface SkuBoundsDao extends BaseMapper<SkuBoundsEntity> {

    SkuBoundsEntity queryObject(Long id);

    List<SkuBoundsEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(SkuBoundsEntity skuBounds);

    void coupdate(SkuBoundsEntity skuBounds);

    void deleteBatch(Long[] ids);

    void codelete(Long id);
}
