package com.nullnews.portal.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nullnews.pojo.UserComment;
import com.nullnews.portal.service.CommentService;

@Controller
public class CommentController {

	@Autowired
	private CommentService commentService;

	/**
	 * 发表评论
	 * 
	 * @param userComment
	 * @return
	 */
	@RequestMapping(value = "/comment", method = RequestMethod.POST)
	@ResponseBody
	public Map addComment(@RequestBody UserComment userComment) {
		Map<Object, Object> result = new HashMap<>();

		boolean p = commentService.addComment(userComment);

		if (p) {
			result.put("error", 0);
			result.put("state", "评论成功");
		} else {
			result.put("error", 0);
			result.put("state", "抱歉,网络好像出了点问题");
		}

		return result;
	}

	@RequestMapping(value = "/likeComment", method = RequestMethod.POST)
	@ResponseBody
	public Map likeComment(@RequestBody UserComment userComment) {
		Map<Object, Object> result = new HashMap<>();
		if (commentService.likeComment(userComment)) {
			result.put("error", 0);
			result.put("state", "评论成功");
		} else {
			result.put("error", 1);
			result.put("state", "网络出现问题");
		}
		return result;
	}

}
