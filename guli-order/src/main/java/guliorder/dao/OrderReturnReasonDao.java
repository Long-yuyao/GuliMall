package guliorder.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import guliorder.entity.OrderReturnReasonEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 退货原因
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {

    OrderReturnReasonEntity queryObject(Long id);

    List<OrderReturnReasonEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(OrderReturnReasonEntity orderReturnReason);

    void updatee(OrderReturnReasonEntity orderReturnReason);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
