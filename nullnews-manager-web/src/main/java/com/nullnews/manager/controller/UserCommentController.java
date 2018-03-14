package com.nullnews.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.nullnews.manager.service.UserCommentService;
import com.nullnews.pojo.UserComment;
import com.nullnews.pojo.UserInfo;

@Controller
public class UserCommentController {
	@Autowired
	private UserCommentService userCommentService;
	
	@RequestMapping("/usercomment")
	public String showUserCommernt(Model model,@RequestParam(defaultValue = "1") String start,
			@RequestParam(defaultValue = "6") String pageSize){
		PageInfo<UserComment> pageInfo =userCommentService.getUserComment(start, pageSize);
		model.addAttribute("pageInfo", pageInfo);
		return "usercomment";
	}
}
