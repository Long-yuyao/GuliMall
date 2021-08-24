package guliorder.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import guliorder.entity.PaymentInfoEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 支付信息表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {

    PaymentInfoEntity queryObject(Long id);

    List<PaymentInfoEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(PaymentInfoEntity paymentInfo);

    void updatee(PaymentInfoEntity paymentInfo);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
