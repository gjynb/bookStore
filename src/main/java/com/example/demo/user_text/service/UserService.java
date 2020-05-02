package com.example.demo.user_text.service;

import com.example.demo.user_text.entity.UserEntity;

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
}
