package com.scs.web.blog.entity;


import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author wenjie_lin
 * @ClassName User
 * @Description 用户实体类
 * @Data 2019/11/18
 * @Version 1.0
 **/
@Data
public class User {
    private Long id;
    private String mobile;
    private String password;
    private String nickname;
    private String avatar;
    private String gender;
    private LocalDate birthday;
    private String address;
    private String introduction;
    //个人中心背景图
    private String banner;
    //邮箱
    private String email;
    //主页
    private String homepage;
    private Short follows;
    private Short fans;
    private Short articles;
    private LocalDateTime createTime;
    private Short status;
}