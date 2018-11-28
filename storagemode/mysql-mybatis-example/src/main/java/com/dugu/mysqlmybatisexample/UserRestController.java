package com.dugu.mysqlmybatisexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class UserRestController
{
    @Autowired
    UserService userService;
    @RequestMapping
    public List<User> getUserList()
    {
        List<User> userList= null;
        return userList;
    }

    public Integer createUser()
    {
        User user = new User;
        user.setUser_name("admin");
        user.setPassword("admin");
        user.setEmail("liuhui@qq.com");
        userService.createUser(user);
    }
}
