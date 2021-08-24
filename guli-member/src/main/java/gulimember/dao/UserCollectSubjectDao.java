package gulimember.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulimember.entity.UserCollectSubjectEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 关注活动表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@Mapper
public interface UserCollectSubjectDao extends BaseMapper<UserCollectSubjectEntity> {

    UserCollectSubjectEntity queryObject(Long id);

    List<UserCollectSubjectEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(UserCollectSubjectEntity userCollectSubject);

    void updatee(UserCollectSubjectEntity userCollectSubject);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
