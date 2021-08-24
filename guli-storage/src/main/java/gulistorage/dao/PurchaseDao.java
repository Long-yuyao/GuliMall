package gulistorage.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulistorage.entity.PurchaseEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 采购信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {

    PurchaseEntity queryObject(Long id);

    List<PurchaseEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(PurchaseEntity purchase);

    void updatee(PurchaseEntity purchase);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
