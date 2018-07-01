package com.whcs.entity;

/**
 * @ClassName: Dept
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author lj
 * @date 2018年3月23日 下午4:48:43
 * 
 * 
 */
public class Dept {
	private Integer id;
	private String name;
	private String loc;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", loc=" + loc + "]";
	}
	
	
}
