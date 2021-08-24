package guliorder.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import guliorder.entity.OrderReturnApplyEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 订单退货申请
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {

    OrderReturnApplyEntity queryObject(Long id);

    List<OrderReturnApplyEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(OrderReturnApplyEntity orderReturnApply);

    void updatee(OrderReturnApplyEntity orderReturnApply);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
