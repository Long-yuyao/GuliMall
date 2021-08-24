package gulicoupon.dao;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulicoupon.entity.SeckillSkuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 秒杀活动商品关联
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@Mapper
public interface SeckillSkuDao extends BaseMapper<SeckillSkuEntity> {

    SeckillSkuEntity queryObject(Long id);

    List<SeckillSkuEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(SeckillSkuEntity seckillSku);

    void coupdate(SeckillSkuEntity seckillSku);

    void codelete(Long id);

    void deleteBatch(Long[] ids);
}
