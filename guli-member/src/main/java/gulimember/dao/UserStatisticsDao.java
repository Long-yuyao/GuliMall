package gulimember.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulimember.entity.UserStatisticsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 统计信息表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@Mapper
public interface UserStatisticsDao extends BaseMapper<UserStatisticsEntity> {

    UserStatisticsEntity queryObject(Long id);

    List<UserStatisticsEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(UserStatisticsEntity userStatistics);

    void updatee(UserStatisticsEntity userStatistics);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
