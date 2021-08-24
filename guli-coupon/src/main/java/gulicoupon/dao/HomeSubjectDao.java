package gulicoupon.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulicoupon.entity.HomeSubjectEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {

    HomeSubjectEntity queryObject(Long id);

    List<HomeSubjectEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(HomeSubjectEntity homeSubject);

    void coupdate(HomeSubjectEntity homeSubject);

    void codelete(Long id);

    void deleteBatch(Long[] ids);
}
