package gulimember.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulimember.entity.IntegrationHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 购物积分记录表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@Mapper
public interface IntegrationHistoryDao extends BaseMapper<IntegrationHistoryEntity> {

    IntegrationHistoryEntity queryObject(Long id);

    List<IntegrationHistoryEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(IntegrationHistoryEntity integrationHistory);

    void updatee(IntegrationHistoryEntity integrationHistory);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
