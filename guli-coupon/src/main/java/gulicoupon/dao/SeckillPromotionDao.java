package gulicoupon.dao;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulicoupon.entity.SeckillPromotionEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 秒杀活动
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@Mapper
public interface SeckillPromotionDao extends BaseMapper<SeckillPromotionEntity> {

    SeckillPromotionEntity queryObject(Long id);

    List<SeckillPromotionEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(SeckillPromotionEntity seckillPromotion);

    void coupdate(SeckillPromotionEntity seckillPromotion);

    void codelete(Long id);

    void deleteBatch(Long[] ids);
}
