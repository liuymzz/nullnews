package com.nullnews.mapper;

import com.nullnews.pojo.Ad1;
import com.nullnews.pojo.Ad1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ad1Mapper {
    long countByExample(Ad1Example example);

    int deleteByExample(Ad1Example example);

    int deleteByPrimaryKey(String adId);

    int insert(Ad1 record);

    int insertSelective(Ad1 record);

    List<Ad1> selectByExample(Ad1Example example);

    Ad1 selectByPrimaryKey(String adId);

    int updateByExampleSelective(@Param("record") Ad1 record, @Param("example") Ad1Example example);

    int updateByExample(@Param("record") Ad1 record, @Param("example") Ad1Example example);

    int updateByPrimaryKeySelective(Ad1 record);

    int updateByPrimaryKey(Ad1 record);
}