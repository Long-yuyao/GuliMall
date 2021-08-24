package com.yuyao.guliproduct.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuyao.guliproduct.entity.SkuAttrValueEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * sku销售属性&值
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@Mapper
public interface SkuAttrValueDao extends BaseMapper<SkuAttrValueEntity> {

    SkuAttrValueEntity queryObject(Long id);

    List<SkuAttrValueEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(SkuAttrValueEntity skuAttrValue);

    void proupdate(SkuAttrValueEntity skuAttrValue);

    void prodelete(Long id);

    void deleteBatch(Long[] ids);
}
