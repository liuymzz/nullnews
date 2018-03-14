package com.nullnews.portal.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nullnews.pojo.Ad1;
import com.nullnews.pojo.Passage;
import com.nullnews.pojo.UserInfo;
import com.nullnews.portal.service.IndexService;

@Controller

public class IndexController {
	@Resource
	private IndexService indexService;

	@RequestMapping("/index")
	public String showIndex(Model model) {
		List<Ad1> list = indexService.getAllAd();
		model.addAttribute("ad1List", list);

		List<Passage> list1 = indexService.selectPassageByPublisTime(1, 4);
		model.addAttribute("newPassageList", list1);

		List<Passage> list2 = indexService.selectPassageByLookCount();
		model.addAttribute("lookCountPassageList", list2);

		List<Passage> list3 = indexService.selectPassageByLookCountAll();
		model.addAttribute("lookAllCountPassageList", list3);

		List<Passage> list4 = indexService.selectPassageByLikeCount();
		model.addAttribute("likeCountPassageList", list4);

		List<Passage> list5 = indexService.selectPassageByLikeCountAll();
		model.addAttribute("likeAllCountPassageList", list5);

		List<UserInfo> list6 = indexService.selectUserByAllLikeCount();
		model.addAttribute("allLikeCountPassageList", list6);

		List<UserInfo> list7 = indexService.selectUserByFollowCount();
		model.addAttribute("followCountList", list7);

		return "index";

	}
}
