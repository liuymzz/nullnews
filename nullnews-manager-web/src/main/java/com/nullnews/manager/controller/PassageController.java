package com.nullnews.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.nullnews.manager.service.PassageService;
import com.nullnews.pojo.Passage;
import com.nullnews.pojo.UserInfo;
import com.nullnews.pojo.UserInfoAndPassage;
@Controller
class PassageController {
	@Autowired
	private PassageService passageService;
	
	
	
	
	
	
	@RequestMapping("/editPassage")
	public String showEditPassage(Model model,@RequestParam(defaultValue = "1") String start,
			@RequestParam(defaultValue = "6") String pageSize){
		PageInfo<UserInfoAndPassage> pageInfo =passageService.selectAllEditPassageByPublishTime(start, pageSize);
		model.addAttribute("pageInfo", pageInfo);
		return "editPassage";
		}
	
	@RequestMapping("/userPassage")
	public String showUserPassage(Model model,@RequestParam(defaultValue = "1") String start,
			@RequestParam(defaultValue = "6") String pageSize){
		PageInfo<UserInfoAndPassage> pageInfo =passageService.selectAllUserPassageByPublishTime1(start, pageSize);
		model.addAttribute("pageInfo", pageInfo);
		return "userPassage";
		}
	
}
