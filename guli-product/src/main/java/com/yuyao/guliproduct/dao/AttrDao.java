package com.yuyao.guliproduct.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuyao.guliproduct.entity.AttrEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {

    AttrEntity queryObject(Long id);

    List<AttrEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(AttrEntity attr);

    void deleteBatch(Long[] ids);

    void prodelete(Long id);

    void proupdate(AttrEntity attr);
}
