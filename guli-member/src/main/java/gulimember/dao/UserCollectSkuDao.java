package gulimember.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulimember.entity.UserCollectSkuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 关注商品表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@Mapper
public interface UserCollectSkuDao extends BaseMapper<UserCollectSkuEntity> {

    UserCollectSkuEntity queryObject(Long id);

    List<UserCollectSkuEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(UserCollectSkuEntity userCollectSku);

    void updatee(UserCollectSkuEntity userCollectSku);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
