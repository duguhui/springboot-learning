package com.dugu.mysqlmybatisexample;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserDao
{
    @Insert({"insert into sys_user(user_name,password,email,user_info,head_img,create_time) values(#{user_name},#{password},#{email},#{user_info},#{head_img},#{create_time})"})
    Integer createUser(User user);

}
