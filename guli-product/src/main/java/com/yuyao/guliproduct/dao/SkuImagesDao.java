package com.yuyao.guliproduct.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuyao.guliproduct.entity.SkuImagesEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * sku图片
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@Mapper
public interface SkuImagesDao extends BaseMapper<SkuImagesEntity> {

    SkuImagesEntity queryObject(Long id);

    List<SkuImagesEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(SkuImagesEntity skuImages);

    void proupdate(SkuImagesEntity skuImages);

    void prodelete(Long id);

    void deleteBatch(Long[] ids);
}
