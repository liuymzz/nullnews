package com.nullnews.mapper;

import com.nullnews.pojo.UserAdmin;
import com.nullnews.pojo.UserAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAdminMapper {
    long countByExample(UserAdminExample example);

    int deleteByExample(UserAdminExample example);

    int deleteByPrimaryKey(String userAdminId);

    int insert(UserAdmin record);

    int insertSelective(UserAdmin record);

    List<UserAdmin> selectByExample(UserAdminExample example);

    UserAdmin selectByPrimaryKey(String userAdminId);

    int updateByExampleSelective(@Param("record") UserAdmin record, @Param("example") UserAdminExample example);

    int updateByExample(@Param("record") UserAdmin record, @Param("example") UserAdminExample example);

    int updateByPrimaryKeySelective(UserAdmin record);

    int updateByPrimaryKey(UserAdmin record);
}