package com.yuyao.guliproduct.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuyao.guliproduct.entity.SpuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * spu信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@Mapper
public interface SpuDao extends BaseMapper<SpuEntity> {

    SpuEntity queryObject(Long id);

    List<SpuEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(SpuEntity spu);

    void proupdate(SpuEntity spu);

    void prodelete(Long id);

    void deleteBatch(Long[] ids);
}
