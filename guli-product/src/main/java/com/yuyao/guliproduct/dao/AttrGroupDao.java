package com.yuyao.guliproduct.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuyao.guliproduct.entity.AttrEntity;
import com.yuyao.guliproduct.entity.AttrGroupEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@Mapper
public interface AttrGroupDao extends BaseMapper<AttrGroupEntity> {

    void proupdate(AttrGroupEntity attrGroup);

    void prodelete(Long id);

    void deleteBatch(Long[] ids);

    int queryTotal(Map<String, Object> map);

    void save(AttrGroupEntity attr);
}
