package com.nullnews.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.nullnews.manager.service.UserCommentService;
import com.nullnews.mapper.UserCommentMapper;
import com.nullnews.pojo.UserComment;
import com.nullnews.pojo.UserCommentExample;
import com.nullnews.pojo.UserCommentExample.Criteria;
@Service
public class UserCommentServiceImpl implements UserCommentService {
	
	@Autowired
	private UserCommentMapper userCommentMapper;
	
	@Override
	public PageInfo<UserComment> getUserComment(String start, String pageSize) {
		UserCommentExample example=new UserCommentExample();
		Criteria criteria = example.createCriteria();
		example.setOrderByClause("comment_time DESC");
		List<UserComment> list=userCommentMapper.selectByExample(example);
		PageInfo<UserComment> pageInfo=new PageInfo<>(list);
		System.out.println(pageInfo.getList());
		return pageInfo;
	}

}
