package guliorder.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import guliorder.entity.RefundInfoEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 退款信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:13:17
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {

    RefundInfoEntity queryObject(Long id);

    List<RefundInfoEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(RefundInfoEntity refundInfo);

    void updatee(RefundInfoEntity refundInfo);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
