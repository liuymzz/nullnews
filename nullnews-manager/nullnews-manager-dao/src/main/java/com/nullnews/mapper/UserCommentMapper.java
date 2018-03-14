package com.nullnews.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nullnews.pojo.UserComment;
import com.nullnews.pojo.UserCommentExample;
import com.nullnews.pojo.UserInfoAndUserComment;

public interface UserCommentMapper {
	long countByExample(UserCommentExample example);

	int deleteByExample(UserCommentExample example);

	int deleteByPrimaryKey(String commentId);

	int insert(UserComment record);

	int insertSelective(UserComment record);

	List<UserComment> selectByExample(UserCommentExample example);

	UserComment selectByPrimaryKey(String commentId);

	int updateByExampleSelective(@Param("record") UserComment record, @Param("example") UserCommentExample example);

	int updateByExample(@Param("record") UserComment record, @Param("example") UserCommentExample example);

	int updateByPrimaryKeySelective(UserComment record);

	int updateByPrimaryKey(UserComment record);

	List<UserInfoAndUserComment> getCommentByPassageLimit(@Param("passageId") String passageId);
}