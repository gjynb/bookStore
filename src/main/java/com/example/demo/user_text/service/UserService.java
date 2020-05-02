package com.example.demo.user_text.service;

import com.example.demo.user_text.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

/**
 * @Author: gjy
 * @Date: 2020/5/2 11:29
 */
public interface UserService {
    /**  显示数据*/
    List<UserEntity> getAll(Map map);

    /**  硬删除*/
    void delById(Integer id);

    /**  保存用户*/
    public void save(UserEntity userEntity);

    /**  根据id查询用户*/
    public UserEntity getUserById(Integer id);

    /**  根据id修改用户*/
    public void updateUserById(@RequestBody UserEntity userEntity);
}
