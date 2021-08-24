package gulicoupon.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulicoupon.entity.HomeAdvEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 首页轮播广告
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@Mapper
public interface HomeAdvDao extends BaseMapper<HomeAdvEntity> {

    HomeAdvEntity queryObject(Long id);

    List<HomeAdvEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(HomeAdvEntity homeAdv);

    void coupdate(HomeAdvEntity homeAdv);

    void codelete(Long id);

    void deleteBatch(Long[] ids);
}
