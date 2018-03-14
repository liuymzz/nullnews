package com.nullnews.portal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.nullnews.pojo.Passage;
import com.nullnews.pojo.UserInfo;
import com.nullnews.portal.service.IndexService;
import com.nullnews.portal.service.PersonalCenterService;

@Controller
public class PersonalCenterController {

	@Autowired
	private PersonalCenterService personalCenterService;
	@Autowired
	private IndexService indexService;

	@RequestMapping("/personal")
	public String ShowPersonalCenter(HttpServletRequest request, Model model,
			@RequestParam(defaultValue = "1") String start, @RequestParam(defaultValue = "10") String pageSize) {
		UserInfo userInfo = (UserInfo) request.getSession().getAttribute("LOGIN_YES");
		if (userInfo != null) {
			// 查询出用户的部分文章
			int s = Integer.parseInt(start);
			int p = Integer.parseInt(pageSize);
			PageInfo<Passage> pageInfo = indexService.selectUserPassageByPublishTime(s, p, userInfo.getUserId());
			model.addAttribute("pageInfo", pageInfo);
		}

		return "personalCenter";
	}

	@RequestMapping("/userIndex/{userId}")
	public String userIndex(@PathVariable String userId, Model model, @RequestParam(defaultValue = "1") String start,
			@RequestParam(defaultValue = "10") String pageSize) {
		UserInfo userInfo = personalCenterService.GetUserInfo(userId);
		model.addAttribute("userInfo", userInfo);
		int s = Integer.parseInt(start);
		int p = Integer.parseInt(pageSize);
		PageInfo<Passage> pageInfo = indexService.selectUserPassageByPublishTime(s, p, userId);
		model.addAttribute("pageInfo", pageInfo);
		return "userIndex";
	}
}
