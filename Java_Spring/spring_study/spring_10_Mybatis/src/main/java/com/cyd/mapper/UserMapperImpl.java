package com.cyd.mapper;

import com.cyd.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    // 我们原来的操作都是用sqlSession来执行，现在都是用 sqlSessionTemplate
    private SqlSessionTemplate sqlSessionTemplate;
    //注入
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
    @Override // 代理
    public List<User> selectUser() {
        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return userMapper.selectUser();
    }
}
