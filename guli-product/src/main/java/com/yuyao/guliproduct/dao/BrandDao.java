package com.yuyao.guliproduct.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuyao.guliproduct.entity.BrandEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 品牌
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {

    BrandEntity queryObject(Long id);

    List<BrandEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(BrandEntity brand);

    void proupdate(BrandEntity brand);

    void prodelete(Long id);

    void deleteBatch(Long[] ids);
}
