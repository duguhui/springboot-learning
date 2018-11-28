package com.dugu.mysqlmybatisexample;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService
{
    @Autowired
    UserDao userDao;

    public Integer createUser(User user)
    {
        Integer result = userDao.createUser(user);
        return  result;
    }
}
