package gulicoupon.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 专题商品
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class HomeSubjectSpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//专题名字
	private String name;
	//专题id
	private Long subjectId;
	//spu_id
	private Long spuId;
	//排序
	private Integer sort;

	/**
	 * 设置：id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：专题名字
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：专题名字
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：专题id
	 */
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	/**
	 * 获取：专题id
	 */
	public Long getSubjectId() {
		return subjectId;
	}
	/**
	 * 设置：spu_id
	 */
	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}
	/**
	 * 获取：spu_id
	 */
	public Long getSpuId() {
		return spuId;
	}
	/**
	 * 设置：排序
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 获取：排序
	 */
	public Integer getSort() {
		return sort;
	}
}
