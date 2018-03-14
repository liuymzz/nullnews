package com.nullnews.portal.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.nullnews.mapper.UserCommentMapper;
import com.nullnews.pojo.UserComment;
import com.nullnews.pojo.UserInfoAndUserComment;
import com.nullnews.portal.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private UserCommentMapper userCommentMapper;

	@Override
	public boolean addComment(UserComment userComment) {
		userComment.setCommentId(StringUtils.replace(UUID.randomUUID().toString(), "-", ""));
		userComment.setCommentTime(new Date());
		userComment.setCommentLike(0);
		userComment.setCommentDislike(0);
		userComment.setCommentState(0);
		try {
			userCommentMapper.insert(userComment);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<UserInfoAndUserComment> getPassageCommentByNews(String passageId, int start, int pageSize) {
		PageHelper.startPage(start, pageSize);
		return userCommentMapper.getCommentByPassageLimit(passageId);
	}

	@Override
	public boolean likeComment(UserComment userComment) {
		try {
			userComment.setCommentLike(userComment.getCommentLike() + 1);
			userCommentMapper.updateByPrimaryKeySelective(userComment);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
