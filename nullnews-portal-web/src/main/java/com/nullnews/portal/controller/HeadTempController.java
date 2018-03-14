package com.nullnews.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.nullnews.pojo.Passage;
import com.nullnews.pojo.UserInfo;
import com.nullnews.portal.service.QuanziService;
import com.nullnews.portal.service.UserService;
import com.nullnews.portal.service.ZhuanlanService;

@Controller
public class HeadTempController {

	@Autowired
	private QuanziService quanziService;
	@Autowired
	private ZhuanlanService zhuanlanService;
	@Autowired
	private UserService userService;

	@RequestMapping("/zixun")
	public String zixun() {

		return "zixun";
	}

	@RequestMapping("/category")
	public String category(Model model, @RequestParam(defaultValue = "1") String start,
			@RequestParam(defaultValue = "6") String pageSize,
			@RequestParam(value = "u", defaultValue = "0") String userType) {
		// 先查上面横排部分数据
		int s = Integer.parseInt(start);
		int p = Integer.parseInt(pageSize);
		PageInfo<UserInfo> userPageInfo = zhuanlanService.selectUserPassageLikeCount(s, p);
		model.addAttribute("userPageInfo", userPageInfo);

		PageInfo<UserInfo> pageInfo2 = null;
		// 再查询下面一部分,如果传入的值不符合要求，则默认为0查询用户排行
		if ("1".equals(userType)) {
			pageInfo2 = userService.getUserByPassageNum(userType);
		} else if ("0".equals(userType)) {
			pageInfo2 = userService.getUserByPassageNum(userType);
		} else {
			userType = "0";
			pageInfo2 = userService.getUserByPassageNum(userType);
		}
		System.out.println(pageInfo2.getList());
		model.addAttribute("pageInfo2", pageInfo2);
		return "category";
	}

	@RequestMapping("/profile")
	public String profile() {
		return "profile";
	}

	@RequestMapping("/quanzi")
	public String quanzi(Model model, @RequestParam(defaultValue = "1") String start,
			@RequestParam(defaultValue = "10") String pageSize) {
		int s = Integer.parseInt(start);
		int p = Integer.parseInt(pageSize);
		PageInfo<Passage> pageInfo = quanziService.getAllUserPassageByPublishTime(s, p);
		model.addAttribute("pageInfo", pageInfo);
		return "quanzi";
	}

}
