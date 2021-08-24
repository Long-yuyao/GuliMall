package gulimember.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulimember.entity.GrowthHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 成长积分记录表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:42:59
 */
@Mapper
public interface GrowthHistoryDao extends BaseMapper<GrowthHistoryEntity> {

    

    List<GrowthHistoryEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(GrowthHistoryEntity growthHistory);

    void updatee(GrowthHistoryEntity growthHistory);

    void deletee(Long id);

    void deleteBatch(Long[] ids);

    GrowthHistoryEntity queryObject(Long id);
}
