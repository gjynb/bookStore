package com.example.demo.user_text.service;

import com.example.demo.user_text.dao.UserDao;
import com.example.demo.user_text.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: gjy
 * @Date: 2020/5/2 11:29
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    /**  显示数据*/
    @Override
    public List<UserEntity> getAll(Map map) {
        return userDao.getAll(map);
    }

    /**  硬删除*/
    @Override
    public void delById(Integer id) {
        userDao.delById(id);
    }
    /**  保存用户*/
    @Override
    public void save(UserEntity userEntity) {

        userEntity.setStatus(1);
        userDao.save(userEntity);
    }
}
