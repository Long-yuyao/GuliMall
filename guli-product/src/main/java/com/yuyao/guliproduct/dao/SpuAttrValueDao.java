package com.yuyao.guliproduct.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuyao.guliproduct.entity.SpuAttrValueEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@Mapper
public interface SpuAttrValueDao extends BaseMapper<SpuAttrValueEntity> {

    SpuAttrValueEntity queryObject(Long id);

    List<SpuAttrValueEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(SpuAttrValueEntity spuAttrValue);

    void proupdate(SpuAttrValueEntity spuAttrValue);

    void prodelete(Long id);

    void deleteBatch(Long[] ids);
}
