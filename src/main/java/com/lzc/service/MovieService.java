/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MovieService.java 
 * @Prject: lzc.movie
 * @Package: com.lzc.service 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月5日 下午8:20:29 
 * @version: V1.0   
 */
package com.lzc.service;

import java.util.List;

import lzc.movie.vo.MovieVO;

/** 
 * @ClassName: MovieService 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月5日 下午8:20:29  
 */
public interface MovieService {

	/** 
	 * @Title: selects 
	 * @Description: TODO
	 * @param vo
	 * @return
	 * @return: List<MovieVO>
	 */
	List<MovieVO> selects(MovieVO vo);

}
