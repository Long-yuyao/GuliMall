package com.yuyao.guliproduct.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuyao.guliproduct.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 商品评价回复关系
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

    CommentReplayEntity queryObject(Long id);

    List<CommentReplayEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(CommentReplayEntity commentReplay);

    void proupdate(CommentReplayEntity commentReplay);

    void prodelete(Long id);

    void deleteBatch(Long[] ids);
}
