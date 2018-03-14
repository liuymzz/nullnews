package com.nullnews.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nullnews.mapper.UserInfoMapper;
import com.nullnews.pojo.UserInfo;
import com.nullnews.portal.service.ZhuanlanService;
@Service
public class ZhuanlanServiceImpl implements ZhuanlanService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public PageInfo<UserInfo> selectUserPassageLikeCount(int start, int pageSize) {
		PageHelper.startPage(start, pageSize);
		List<UserInfo> list=userInfoMapper.selectUserPassageLikeCount();
		PageInfo<UserInfo> pageInfo=new PageInfo<>(list);
		return pageInfo;
	}

}
