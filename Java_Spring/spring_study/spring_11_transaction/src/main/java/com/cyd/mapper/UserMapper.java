package com.cyd.mapper;

import com.cyd.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public List<User> selectUsers();
    // add user
    public int addUser(User user);
    // delete
    public void deleteUser(@Param("id")int id);
}
