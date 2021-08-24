package guliorder.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import guliorder.entity.OrderItemEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 订单项信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

    OrderItemEntity queryObject(Long id);

    List<OrderItemEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(OrderItemEntity orderItem);

    void updatee(OrderItemEntity orderItem);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
