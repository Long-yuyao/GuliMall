package com.yuyao.guliproduct.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuyao.guliproduct.entity.SpuDescEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * spu信息介绍
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@Mapper
public interface SpuDescDao extends BaseMapper<SpuDescEntity> {

    SpuDescEntity queryObject(Long spuId);

    List<SpuDescEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(SpuDescEntity spuDesc);

    void proupdate(SpuDescEntity spuDesc);

    void prodelete(Long spuId);

    void deleteBatch(Long[] spuIds);
}
