package com.taotao.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页跳转
 * @author zoushiming
 *
 */


public class PageController {
   
	
	@RequestMapping("/")
   public String showIndex(){
	return "index";
}

	
}