package com.nullnews.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nullnews.pojo.UserFollow;
import com.nullnews.pojo.UserFollowExample;
import com.nullnews.pojo.UserInfo;

public interface UserFollowMapper {
	long countByExample(UserFollowExample example);

	int deleteByExample(UserFollowExample example);

	int insert(UserFollow record);

	int insertSelective(UserFollow record);

	List<UserFollow> selectByExample(UserFollowExample example);

	int updateByExampleSelective(@Param("record") UserFollow record, @Param("example") UserFollowExample example);

	int updateByExample(@Param("record") UserFollow record, @Param("example") UserFollowExample example);

	/**
	 * 根据传入的用户id查询该用户的关注列表
	 * 
	 * @param userId
	 * @return
	 */
	List<UserInfo> selectFollowUserByUserId(@Param("userId") String userId);
}