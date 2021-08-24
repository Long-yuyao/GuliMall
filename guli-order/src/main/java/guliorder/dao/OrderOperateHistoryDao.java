package guliorder.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import guliorder.entity.OrderOperateHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 订单操作历史记录
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {

    List<OrderOperateHistoryEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    OrderOperateHistoryEntity queryObject(Long id);

    void save(OrderOperateHistoryEntity orderOperateHistory);

    void updatee(OrderOperateHistoryEntity orderOperateHistory);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
