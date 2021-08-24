package gulistorage.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulistorage.entity.WareOrderBillDetailEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 库存工作单
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
@Mapper
public interface WareOrderBillDetailDao extends BaseMapper<WareOrderBillDetailEntity> {

    WareOrderBillDetailEntity queryObject(Long id);

    List<WareOrderBillDetailEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(WareOrderBillDetailEntity wareOrderBillDetail);

    void updatee(WareOrderBillDetailEntity wareOrderBillDetail);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
