package com.nullnews.portal.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nullnews.pojo.Passage;
import com.nullnews.pojo.UserInfo;
import com.nullnews.pojo.UserInfoAndUserComment;
import com.nullnews.portal.service.CommentService;
import com.nullnews.portal.service.IndexService;
import com.nullnews.portal.service.NewsService;
import com.nullnews.portal.service.PersonalCenterService;
import com.nullnews.portal.service.PublishService;

@Controller
public class NewsController {

	@Autowired
	private PublishService publishService;
	@Autowired
	private NewsService newsService;
	@Autowired
	private CommentService commentService;
	@Autowired
	private PersonalCenterService personalCenterService;
	@Autowired
	private IndexService indexService;

	@RequestMapping("/news/{id}")
	public String showPassage(@PathVariable() String id, Model model, @RequestParam(defaultValue = "1") String start,
			@RequestParam(defaultValue = "10") String pageSize) {

		// 从数据库获取文章数据
		Passage passage = publishService.getPassage(id);

		// 获取了文章数据同时文章浏览数量增加一个
		Passage newPassage = new Passage();
		newPassage.setPassageId(passage.getPassageId());
		newPassage.setPassageLookCount(passage.getPassageLookCount() + 1);
		publishService.updatePassage(newPassage);

		// 将获取的数据放置model中，供相应的jsp页面使用
		model.addAttribute("passage", passage);
		int s = 0;
		int p = 0;
		s = Integer.parseInt(start);
		p = Integer.parseInt(pageSize);
		// 获取文章数据之后再获取评论
		List<UserInfoAndUserComment> comments = commentService.getPassageCommentByNews(passage.getPassageId(), s, p);

		model.addAttribute("commentsAndUsers", comments);

		// 获取用户基本信息
		UserInfo userInfo = personalCenterService.GetUserInfo(passage.getUserId());
		model.addAttribute("userInfo", userInfo);

		// 获取左侧边栏数据
		List<UserInfo> list6 = indexService.selectUserByAllLikeCount();
		model.addAttribute("allLikeCountPassageList", list6);

		List<UserInfo> list7 = indexService.selectUserByFollowCount();
		model.addAttribute("followCountList", list7);

		return "news";
	}

	@RequestMapping("/newslike")
	@ResponseBody
	public Map like(String passageId) {
		Map result = new HashMap<>();
		boolean p = newsService.like(passageId);
		if (p) {
			result.put("error", 0);
		} else {
			result.put("error", 1);
		}

		return result;
	}

}
