/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MovieVO.java 
 * @Prject: lzc.movie
 * @Package: lzc.movie.vo 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月5日 下午8:17:31 
 * @version: V1.0   
 */
package lzc.movie.vo;

import lzc.movie.domain.Movie;

/** 
 * @ClassName: MovieVO 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月5日 下午8:17:31  
 */
public class MovieVO extends Movie{
	private String uptimeStart;//上映开始时间
	private String uptimeEnd;
	private String durationStart;//电影时间长
	private String durationEnd;
	private String p1;//最低价格
	private String p2;
	private String orderByColumn; //排序字段
	private String orderByMethod;//排序方法 asc desc
	@Override
	public String toString() {
		return "MovieVO [uptimeStart=" + uptimeStart + ", uptimeEnd=" + uptimeEnd + ", durationStart=" + durationStart
				+ ", durationEnd=" + durationEnd + ", p1=" + p1 + ", p2=" + p2 + ", orderByColumn=" + orderByColumn
				+ ", orderByMethod=" + orderByMethod + "]";
	}
	public String getUptimeStart() {
		return uptimeStart;
	}
	public void setUptimeStart(String uptimeStart) {
		this.uptimeStart = uptimeStart;
	}
	public String getUptimeEnd() {
		return uptimeEnd;
	}
	public void setUptimeEnd(String uptimeEnd) {
		this.uptimeEnd = uptimeEnd;
	}
	public String getDurationStart() {
		return durationStart;
	}
	public void setDurationStart(String durationStart) {
		this.durationStart = durationStart;
	}
	public String getDurationEnd() {
		return durationEnd;
	}
	public void setDurationEnd(String durationEnd) {
		this.durationEnd = durationEnd;
	}
	public String getP1() {
		return p1;
	}
	public void setP1(String p1) {
		this.p1 = p1;
	}
	public String getP2() {
		return p2;
	}
	public void setP2(String p2) {
		this.p2 = p2;
	}
	public String getOrderByColumn() {
		return orderByColumn;
	}
	public void setOrderByColumn(String orderByColumn) {
		this.orderByColumn = orderByColumn;
	}
	public String getOrderByMethod() {
		return orderByMethod;
	}
	public void setOrderByMethod(String orderByMethod) {
		this.orderByMethod = orderByMethod;
	}
	

}
