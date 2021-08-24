package gulicoupon.dao;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulicoupon.entity.SeckillSessionEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 秒杀活动场次
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {

    SeckillSessionEntity queryObject(Long id);

    List<SeckillSessionEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(SeckillSessionEntity seckillSession);

    void coupdate(SeckillSessionEntity seckillSession);

    void codelete(Long id);

    void deleteBatch(Long[] ids);
}
