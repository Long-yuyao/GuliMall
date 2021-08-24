package gulistorage.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulistorage.entity.PurchaseDetailEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
@Mapper
public interface PurchaseDetailDao extends BaseMapper<PurchaseDetailEntity> {

    PurchaseDetailEntity queryObject(Long id);

    List<PurchaseDetailEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(PurchaseDetailEntity purchaseDetail);

    void updatee(PurchaseDetailEntity purchaseDetail);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
