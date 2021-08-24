package gulicoupon.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-06 22:06:16
 */
public class HomeSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//专题名字
	private String name;
	//专题标题
	private String title;
	//专题副标题
	private String subTitle;
	//显示状态
	private Integer status;
	//详情连接
	private String url;
	//排序
	private Integer sort;
	//专题图片地址
	private String img;

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
	 * 设置：专题标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：专题标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：专题副标题
	 */
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	/**
	 * 获取：专题副标题
	 */
	public String getSubTitle() {
		return subTitle;
	}
	/**
	 * 设置：显示状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：显示状态
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：详情连接
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：详情连接
	 */
	public String getUrl() {
		return url;
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
	/**
	 * 设置：专题图片地址
	 */
	public void setImg(String img) {
		this.img = img;
	}
	/**
	 * 获取：专题图片地址
	 */
	public String getImg() {
		return img;
	}
}
