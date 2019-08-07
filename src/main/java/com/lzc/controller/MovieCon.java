/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MovieCon.java 
 * @Prject: lzc.movie
 * @Package: com.lzc.controller 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月5日 下午8:18:44 
 * @version: V1.0   
 */
package com.lzc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzc.service.MovieService;

import lzc.movie.vo.MovieVO;

/** 
 * @ClassName: MovieCon 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月5日 下午8:18:44  
 */
@Controller
public class MovieCon {

	@Autowired
	MovieService s;
	@RequestMapping("list")
	public String selects(MovieVO vo,@RequestParam(defaultValue = "1")int pageNum,HttpServletRequest request) {
		PageHelper.startPage(pageNum, 2);
		List<MovieVO> list = s.selects(vo);
		PageInfo<MovieVO> pg = new PageInfo<MovieVO>(list);
		request.setAttribute("pg", pg);
		return "list";
	}
}
