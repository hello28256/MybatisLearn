package com.yangq.dao;

import com.yangq.pojo.User;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/13 21:58
 */

public class UserMapperImpl implements UserMapper {
    @Override
    public List<User> getUserList() {
        return Collections.emptyList();
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        System.out.println("id = " + id);
        return 0;
    }

    @Override
    public int updateUser(User user) {

        System.out.println("user = " + user);
        System.out.println("user = " + user);
        System.out.println("user = " + user);
        System.out.println("user = " + user);
        System.out.println("user = " + user);
        System.out.println("user = " + user);
        System.out.println("user = " + user);
        System.out.println("user = " + user);
        System.out.println("user = " + user);
        return 0;
    }

    @Override
    public User getUserById(int id) {
        int index = 33333;
        System.out.println(index);
        return null;
    }

    @Override
    public List<User> getUserByLimit(Map<String, Integer> map) {
        return Collections.emptyList();
    }

}
