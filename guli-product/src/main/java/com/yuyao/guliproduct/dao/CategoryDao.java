package com.yuyao.guliproduct.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuyao.guliproduct.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

    CategoryEntity queryObject(Long id);

    List<CategoryEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(CategoryEntity category);

    void proupdate(CategoryEntity category);

    void prodelete(Long id);

    void deleteBatch(Long[] ids);
}
