package com.yuyao.guliproduct.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuyao.guliproduct.entity.CommentEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 商品评价
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@Mapper
public interface CommentDao extends BaseMapper<CommentEntity> {

    CommentEntity queryObject(Long id);

    List<CommentEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(CommentEntity comment);

    void proupdate(CommentEntity comment);

    void prodelete(Long id);

    void deleteBatch(Long[] ids);
}
