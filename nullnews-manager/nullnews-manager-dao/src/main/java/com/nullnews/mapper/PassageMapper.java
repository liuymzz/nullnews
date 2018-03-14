package com.nullnews.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nullnews.pojo.Passage;
import com.nullnews.pojo.PassageExample;
import com.nullnews.pojo.UserInfoAndPassage;

public interface PassageMapper {
	long countByExample(PassageExample example);

	int deleteByExample(PassageExample example);

	int deleteByPrimaryKey(String passageId);

	int insert(Passage record);

	int insertSelective(Passage record);

	List<Passage> selectByExampleWithBLOBs(PassageExample example);

	List<Passage> selectByExample(PassageExample example);

	Passage selectByPrimaryKey(String passageId);

	int updateByExampleSelective(@Param("record") Passage record, @Param("example") PassageExample example);

	int updateByExampleWithBLOBs(@Param("record") Passage record, @Param("example") PassageExample example);

	int updateByExample(@Param("record") Passage record, @Param("example") PassageExample example);

	int updateByPrimaryKeySelective(Passage record);

	int updateByPrimaryKeyWithBLOBs(Passage record);

	int updateByPrimaryKey(Passage record);

	List<Passage> selectPassageByPublisTime();

	List<Passage> selectPassageByLookCount();

	List<Passage> selectPassageByLookCountAll();

	List<Passage> selectPassageByLikeCount();

	List<Passage> selectPassageByLikeCountAll();

	List<Passage> selectUserPassageByPublishTime(@Param("userId") String userId);

	List<Passage> selectAllUserPassageByPublishTime();
	
	List<UserInfoAndPassage> selectAllEditPassageByPublishTime();
	
	List<UserInfoAndPassage> selectAllUserPassageByPublishTime1();

}