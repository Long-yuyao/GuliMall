package gulicoupon.dao;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulicoupon.entity.CouponEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 优惠券信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {

    CouponEntity queryObject(Long id);

    List<CouponEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(CouponEntity coupon);

    void coupdate(CouponEntity coupon);

    void codelete(Long id);

    void deleteBatch(Long[] ids);
}
