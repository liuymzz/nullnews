package com.nullnews.portal.service;

import com.github.pagehelper.PageInfo;
import com.nullnews.pojo.UserFollow;
import com.nullnews.pojo.UserInfo;

public interface UserService {
	/**
	 * 用户登陆
	 * 
	 * @param user
	 * @return
	 */
	UserInfo login(UserInfo user);

	/**
	 * 用户注册时给手机发送短信验证码
	 * 
	 * @param phoneNum
	 * @return
	 */
	boolean sendsendSecurityCode(String phoneNum);

	/**
	 * 检查用户输入的短信验证码是否正确
	 * 
	 * @param userInfo
	 * @return
	 */
	boolean checkSecurityCode(UserInfo userInfo);

	/**
	 * 用户注册
	 * 
	 * @param userInfo
	 * @return
	 */
	UserInfo registerUser(UserInfo userInfo);

	/**
	 * 判断手机号是否被注册，被注册返回true
	 * 
	 * @param phoneNum
	 * @return
	 */
	boolean checkPhoneNum(String phoneNum);

	/**
	 * 根据文章数量排行查询用户
	 * 
	 * @param userType
	 *            用户类型，1是小编，0是用户
	 * @return
	 */
	PageInfo<UserInfo> getUserByPassageNum(String userType);

	/**
	 * 判断对象中的数据是否在数据库中存在，既已关注，返回true表示已经发生关注
	 * 
	 * @param userFollow
	 * @return
	 */
	boolean isFollow(UserFollow userFollow);

	/**
	 * 取消关注
	 * 
	 * @param userFollow
	 * @return
	 */
	boolean cancelFollowUser(UserFollow userFollow);
}
