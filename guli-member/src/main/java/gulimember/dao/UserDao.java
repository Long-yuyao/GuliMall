package gulimember.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import gulimember.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 用户表
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:43:00
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

    UserEntity queryObject(Long id);

    List<UserEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(UserEntity user);

    void updatee(UserEntity user);

    void deletee(Long id);

    void deleteBatch(Long[] ids);
}
