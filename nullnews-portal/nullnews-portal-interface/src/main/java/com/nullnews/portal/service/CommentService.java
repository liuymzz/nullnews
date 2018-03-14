package com.nullnews.portal.service;

import java.util.List;

import com.nullnews.pojo.UserComment;
import com.nullnews.pojo.UserInfoAndUserComment;

public interface CommentService {

	/**
	 * 添加评论
	 * 
	 * @param userComment
	 * @return
	 */
	boolean addComment(UserComment userComment);

	/**
	 * 首页获取评论
	 * 
	 * @param passageId
	 * @param start
	 * @param pageSize
	 * @return
	 */
	List<UserInfoAndUserComment> getPassageCommentByNews(String passageId, int start, int pageSize);

	/**
	 * 赞评论
	 * 
	 * @param userComment
	 * @return
	 */
	boolean likeComment(UserComment userComment);
}
