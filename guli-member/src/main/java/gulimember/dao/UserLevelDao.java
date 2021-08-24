package gulimember.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulimember.entity.UserLevelEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 会员等级表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@Mapper
public interface UserLevelDao extends BaseMapper<UserLevelEntity> {

    UserLevelEntity queryObject(Long id);

    List<UserLevelEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(UserLevelEntity userLevel);

    void updatee(UserLevelEntity userLevel);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
