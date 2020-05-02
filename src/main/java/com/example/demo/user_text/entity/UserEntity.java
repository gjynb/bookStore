package com.example.demo.user_text.entity;

import java.util.Date;

/**
 * @Author: gjy
 * @Date: 2020/5/2 11:32
 */
public class UserEntity {
    private Integer id;
    private String username;
    private String password;
    private Date createtime;
    private Integer stauts;

    public UserEntity() {
    }

    public UserEntity(Integer id, String username, String password, Date createtime, Integer stauts) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createtime = createtime;
        this.stauts = stauts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return stauts;
    }

    public void setStatus(Integer stauts) {
        this.stauts = stauts;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createtime=" + createtime +
                ", stauts=" + stauts +
                '}';
    }
}
