package com.yuyao.guliproduct.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuyao.guliproduct.entity.CategoryBrandEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 品牌分类关联
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@Mapper
public interface CategoryBrandDao extends BaseMapper<CategoryBrandEntity> {

    CategoryBrandEntity queryObject(Long id);

    List<CategoryBrandEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(CategoryBrandEntity categoryBrand);

    void proupdate(CategoryBrandEntity categoryBrand);

    void prodelete(Long id);

    void deleteBatch(Long[] ids);
}
