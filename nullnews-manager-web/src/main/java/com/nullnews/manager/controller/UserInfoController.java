package com.nullnews.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.nullnews.manager.service.UserInfoService;
import com.nullnews.pojo.UserInfo;
import com.nullnews.pojo.UserInfoAndPassage;

@Controller
public class UserInfoController {
	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping("/user")
	public String showUser(Model model,@RequestParam(defaultValue = "1") String start,
			@RequestParam(defaultValue = "10") String pageSize){
		PageInfo<UserInfo> pageInfo =userInfoService.selectUserByaddTime(start, pageSize);
		model.addAttribute("pageInfo", pageInfo);
		return "user";
	}
	@RequestMapping("/edit")
	public String showEdit(Model model,@RequestParam(defaultValue = "1") String start,
			@RequestParam(defaultValue = "10") String pageSize){
		PageInfo<UserInfo> pageInfo =userInfoService.selectEditByaddTime(start, pageSize);
		model.addAttribute("pageInfo", pageInfo);
		return "edit";
	}
}
