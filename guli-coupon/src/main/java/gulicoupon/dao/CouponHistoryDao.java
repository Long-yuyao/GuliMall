package gulicoupon.dao;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulicoupon.entity.CouponHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 优惠券领取历史记录
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {

    CouponHistoryEntity queryObject(Long id);

    List<CouponHistoryEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(CouponHistoryEntity couponHistory);

    void coupdate(CouponHistoryEntity couponHistory);

    void codelete(Long id);

    void deleteBatch(Long[] ids);
}
