package com.yuyao.guliproduct.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuyao.guliproduct.entity.SkuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * sku信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@Mapper
public interface SkuDao extends BaseMapper<SkuEntity> {

    SkuEntity queryObject(Long id);

    List<SkuEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(SkuEntity sku);

    void proupdate(SkuEntity sku);

    void prodelete(Long id);

    void deleteBatch(Long[] ids);
}
