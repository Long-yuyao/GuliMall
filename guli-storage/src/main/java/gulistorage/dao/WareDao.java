package gulistorage.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulistorage.entity.WareEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 仓库信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
@Mapper
public interface WareDao extends BaseMapper<WareEntity> {

    WareEntity queryObject(Long id);

    List<WareEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(WareEntity ware);

    void updatee(WareEntity ware);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
