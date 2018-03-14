package com.nullnews.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nullnews.pojo.UserInfo;
import com.nullnews.pojo.UserInfoExample;

public interface UserInfoMapper {
	long countByExample(UserInfoExample example);

	int deleteByExample(UserInfoExample example);

	int deleteByPrimaryKey(String userId);

	int insert(UserInfo record);

	int insertSelective(UserInfo record);

	List<UserInfo> selectByExample(UserInfoExample example);

	UserInfo selectByPrimaryKey(String userId);

	int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

	int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

	int updateByPrimaryKeySelective(UserInfo record);

	int updateByPrimaryKey(UserInfo record);

	List<UserInfo> selectUserByAllLikeCount();
	
	List<UserInfo> selectUserPassageLikeCount();

	List<UserInfo> selectUserByFollowCount();

	List<UserInfo> selectEditByaddTime();
	
	List<UserInfo> selectUserByaddTime();

	/**
	 * 根据用户id查询用户发布文章数量
	 * 
	 * @param userId
	 * @return
	 */
	int selectUserPassageNum(@Param("userId") String userId);

	/**
	 * 根据用户发布文章数量，排行查询用户
	 * 
	 * @param userType
	 *            用户类型，0是用户，1是小编
	 * @return
	 */
	List<UserInfo> selectAllUserByPassageNum(@Param("userType") String userType);
}