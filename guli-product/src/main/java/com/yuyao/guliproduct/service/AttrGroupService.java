package com.yuyao.guliproduct.service;

import com.yuyao.guliproduct.entity.AttrGroupEntity;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-07-31 21:58:54
 */
public interface AttrGroupService {
	
	AttrGroupEntity queryObject(Long id);
	
	List<AttrGroupEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(AttrGroupEntity attrGroup);
	
	void update(AttrGroupEntity attrGroup);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
