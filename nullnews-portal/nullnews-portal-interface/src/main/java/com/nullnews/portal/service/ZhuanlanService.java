package com.nullnews.portal.service;

import com.github.pagehelper.PageInfo;
import com.nullnews.pojo.UserInfo;

public interface ZhuanlanService {
	
	PageInfo<UserInfo> selectUserPassageLikeCount(int start, int pageSize);
}
