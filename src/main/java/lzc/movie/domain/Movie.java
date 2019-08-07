/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Movie.java 
 * @Prject: lzc.movie
 * @Package: lzc.movie.domain 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月5日 下午8:14:53 
 * @version: V1.0   
 */
package lzc.movie.domain;

/** 
 * @ClassName: Movie 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月5日 下午8:14:53  
 */
public class Movie {
	
	private Integer mid;
	private String mname;
	private String actor;//导演
	private Integer  price;//价格
	private String uptime;//上映时间
	private String longs;//时长
	private String types;//类型
	private Integer years;//年代
	private String qy;//区域
	private Integer zt;//状态
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", actor=" + actor + ", price=" + price + ", uptime=" + uptime
				+ ", longs=" + longs + ", types=" + types + ", years=" + years + ", qy=" + qy + ", zt=" + zt + "]";
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public String getLongs() {
		return longs;
	}
	public void setLongs(String longs) {
		this.longs = longs;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public Integer getYears() {
		return years;
	}
	public void setYears(Integer years) {
		this.years = years;
	}
	public String getQy() {
		return qy;
	}
	public void setQy(String qy) {
		this.qy = qy;
	}
	public Integer getZt() {
		return zt;
	}
	public void setZt(Integer zt) {
		this.zt = zt;
	}
	
	

}
