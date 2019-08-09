package com.taotao.portal.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * 首页访问
 * @author zoushiming
 *
 */
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.portal.service.ContentService;
@Controller
public class IndexController {
	@Resource
	private ContentService contentService;
	@RequestMapping("/index")
	public String showIndex(Model model) {
       //取大广告内容
		String json = contentService.getAd1List();
		//传递给页面
		model.addAttribute("ad1", json);
		return "index";
	}
	
	@RequestMapping(value="/posttest",method=RequestMethod.POST)
	@ResponseBody
	public String postTest(String name,String pass){
		System.out.println(name);
		System.out.println(pass);
		return "OK";
	}
	
}
