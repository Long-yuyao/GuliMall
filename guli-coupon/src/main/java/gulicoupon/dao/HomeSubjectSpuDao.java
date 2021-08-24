package gulicoupon.dao;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulicoupon.entity.HomeSubjectSpuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 专题商品
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@Mapper
public interface HomeSubjectSpuDao extends BaseMapper<HomeSubjectSpuEntity> {

    HomeSubjectSpuEntity queryObject(Long id);

    List<HomeSubjectSpuEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(HomeSubjectSpuEntity homeSubjectSpu);

    void coupdate(HomeSubjectSpuEntity homeSubjectSpu);

    void codelete(Long id);

    void deleteBatch(Long[] ids);
}
