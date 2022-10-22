package com.cyd.mapper;

import com.cyd.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private  SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectUsers() {
        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return userMapper.selectUsers();
    }

    @Override
    public int addUser(User user) {
        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        userMapper.addUser(user);
        return 0;
    }
    @Override
    public void deleteUser(int id) {
        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        userMapper.deleteUser(id);
    }
}
