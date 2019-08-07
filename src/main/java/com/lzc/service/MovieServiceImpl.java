/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MovieServiceImpl.java 
 * @Prject: lzc.movie
 * @Package: com.lzc.service 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月5日 下午8:21:00 
 * @version: V1.0   
 */
package com.lzc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzc.dao.MovieMapper;

import lzc.movie.vo.MovieVO;

/** 
 * @ClassName: MovieServiceImpl 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月5日 下午8:21:00  
 */
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieMapper m;

	/* (non Javadoc) 
	 * @Title: selects
	 * @Description: TODO
	 * @param vo
	 * @return 
	 * @see com.lzc.service.MovieService#selects(lzc.movie.vo.MovieVO) 
	 */
	@Override
	public List<MovieVO> selects(MovieVO vo) {
		// TODO Auto-generated method stub
		return m.selects(vo);
	}
	
	
}
