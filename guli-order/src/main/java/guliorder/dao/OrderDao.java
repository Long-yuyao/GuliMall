package guliorder.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import guliorder.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 订单
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

    OrderEntity queryObject(Long id);

    List<OrderEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(OrderEntity order);

    void updatee(OrderEntity order);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
