package com.yangq.dao;

import com.yangq.pojo.User;
import com.yangq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/13 22:33
 */

public class UserMapperTest {


    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userlist = mapper.getUserList();

        for (User user : userlist) {
            System.out.println(user);
        }
        sqlSession.close();
    }


    @Test
    public void addUsertest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(7,"王五","222222"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUsertest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.deleteUser(7);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void updateUsertest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.updateUser(new User(6, "yangq", "11111111"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserByIdtest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(6);
        System.out.println(user);
        sqlSession.close();

        logger.info("info:进入了testLog4j");
        logger.debug("debug：testLog4j");
        logger.error("error:进入了testLog4j");
    }


    @Test
    public void getUserByListtest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String,Integer> map = new HashMap<>();
        map.put("startIndex",1);
        map.put("pageIndex",4);

        List<User> userByLimit = mapper.getUserByLimit(map);
        for (User user : userByLimit) {
            System.out.println(user);
        }

        sqlSession.close();

    }

}
