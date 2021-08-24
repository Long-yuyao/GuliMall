package gulistorage.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 仓库信息
 * 
 * @author yuyaolong
 * @email 15872183526@163.com
 * @date 2021-08-08 15:46:23
 */
public class WareEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//仓库名
	private String name;
	//仓库地址
	private String address;
	//区域编码
	private String areacode;

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
	 * 设置：仓库名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：仓库名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：仓库地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：仓库地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：区域编码
	 */
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}
	/**
	 * 获取：区域编码
	 */
	public String getAreacode() {
		return areacode;
	}
}
