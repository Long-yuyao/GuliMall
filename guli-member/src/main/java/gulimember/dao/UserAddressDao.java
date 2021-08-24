package gulimember.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulimember.entity.UserAddressEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 收货地址表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@Mapper
public interface UserAddressDao extends BaseMapper<UserAddressEntity> {

    UserAddressEntity queryObject(Long id);

    List<UserAddressEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(UserAddressEntity userAddress);

    void updatee(UserAddressEntity userAddress);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
