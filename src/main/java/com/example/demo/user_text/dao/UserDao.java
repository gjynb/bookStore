package com.example.demo.user_text.dao;

import com.example.demo.user_text.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

/**
 * @Author: gjy
 * @Date: 2020/5/2 11:30
 */

@Mapper
public interface UserDao {
    /**  显示数据*/
    List<UserEntity> getAll(@Param("content") Map map);
    /**  硬删除*/
    void delById(Integer id);
    /**  保存用户*/
    public void save(UserEntity userEntity);
    /**  根据id查询用户*/
    public UserEntity getUserById(Integer id);
    /**  根据id修改用户*/
    public void updateUserById(UserEntity userEntity);
}
