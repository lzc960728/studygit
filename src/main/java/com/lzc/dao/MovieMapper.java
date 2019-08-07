/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MovieMapper.java 
 * @Prject: lzc.movie
 * @Package: com.lzc.dao 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月5日 下午8:21:50 
 * @version: V1.0   
 */
package com.lzc.dao;

import java.util.List;

import lzc.movie.vo.MovieVO;

/** 
 * @ClassName: MovieMapper 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月5日 下午8:21:50  
 */
public interface MovieMapper {

	/** 
	 * @Title: selects 
	 * @Description: TODO
	 * @param vo
	 * @return
	 * @return: List<MovieVO>
	 */
	List<MovieVO> selects(MovieVO vo);

}
