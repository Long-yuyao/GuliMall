package guliorder.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import guliorder.entity.OrderSettingEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 订单配置信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {

    OrderSettingEntity queryObject(Long id);

    List<OrderSettingEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(OrderSettingEntity orderSetting);

    void updatee(OrderSettingEntity orderSetting);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
