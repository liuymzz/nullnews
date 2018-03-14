package com.nullnews.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nullnews.manager.service.UserInfoService;
import com.nullnews.mapper.UserInfoMapper;
import com.nullnews.pojo.UserInfo;
import com.nullnews.pojo.UserInfoAndPassage;
import com.nullnews.pojo.UserInfoExample;
import com.nullnews.pojo.UserInfoExample.Criteria;


@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
	
    @Override
	public PageInfo<UserInfo> selectUserByaddTime(String start, String pageSize) {
    	int s = Integer.parseInt(start);
		int p = Integer.parseInt(pageSize);
		PageHelper.startPage(s, p);
		List<UserInfo> list=userInfoMapper.selectUserByaddTime();
		PageInfo<UserInfo> pageInfo=new PageInfo<>(list);
		return pageInfo;
	}
    @Override
    public PageInfo<UserInfo> selectEditByaddTime(String start, String pageSize) {
    	int s = Integer.parseInt(start);
		int p = Integer.parseInt(pageSize);
		PageHelper.startPage(s, p);
		List<UserInfo> list=userInfoMapper.selectEditByaddTime();
		PageInfo<UserInfo> pageInfo=new PageInfo<>(list);
		return pageInfo;
	}
	/*@Override
	public PageInfo<UserInfo> getUser(String start, String pageSize) {
		UserInfoExample ex=new UserInfoExample();
		ex.createCriteria().andUserTypeEqualTo(0);
		ex.setOrderByClause("user_addtime desc");
		List<UserInfo> list = userInfoMapper.selectByExample(ex);
		PageInfo<UserInfo> pageInfo=new PageInfo<>(list);
		System.out.println(pageInfo.getList());
		return pageInfo;
	}
	
	@Override
	public PageInfo<UserInfo> getEdit(String start, String pageSize) {
		UserInfoExample ex=new UserInfoExample();
		ex.createCriteria().andUserTypeEqualTo(1);
		ex.setOrderByClause("user_addtime desc");
		List<UserInfo> list = userInfoMapper.selectByExample(ex);
		PageInfo<UserInfo> pageInfo=new PageInfo<>(list);
		return pageInfo;
	}*/

}
