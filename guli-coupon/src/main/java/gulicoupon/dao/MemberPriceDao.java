package gulicoupon.dao;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulicoupon.entity.MemberPriceEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 商品会员价格
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

    MemberPriceEntity queryObject(Long id);

    List<MemberPriceEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(MemberPriceEntity memberPrice);

    void coupdate(MemberPriceEntity memberPrice);

    void codelete(Long id);

    void deleteBatch(Long[] ids);
}
