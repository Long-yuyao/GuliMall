package gulimember.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulimember.entity.UserCollectShopEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 关注店铺表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@Mapper
public interface UserCollectShopDao extends BaseMapper<UserCollectShopEntity> {

    UserCollectShopEntity queryObject(Long id);

    List<UserCollectShopEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(UserCollectShopEntity userCollectShop);

    void updatee(UserCollectShopEntity userCollectShop);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
