package com.nullnews.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nullnews.mapper.UserFollowMapper;
import com.nullnews.pojo.UserFollow;
import com.nullnews.pojo.UserInfo;
import com.nullnews.portal.service.UserFollowService;

@Service
public class UserFollowServiceImpl implements UserFollowService {

	@Autowired
	private UserFollowMapper userFollowMapper;

	@Override
	public PageInfo<UserInfo> getFollowUserByUserId(String userId) {
		PageHelper.startPage(1, 16);
		List<UserInfo> list = userFollowMapper.selectFollowUserByUserId(userId);
		PageInfo<UserInfo> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	@Override
	public boolean followUser(UserFollow userFollow) {
		System.out.println(userFollow.getFollowId());
		System.out.println(userFollow.getUserId());
		boolean p = false;
		try {
			userFollowMapper.insert(userFollow);
			p = true;
		} catch (Exception e) {
			p = false;
		}
		return p;
	}

}
