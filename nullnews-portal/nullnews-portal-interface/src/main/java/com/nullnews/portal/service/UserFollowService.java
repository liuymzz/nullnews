package com.nullnews.portal.service;

import com.github.pagehelper.PageInfo;
import com.nullnews.pojo.UserFollow;
import com.nullnews.pojo.UserInfo;

public interface UserFollowService {
	PageInfo<UserInfo> getFollowUserByUserId(String userId);

	boolean followUser(UserFollow userFollow);
}
