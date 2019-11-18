package com.scs.web.blog.domain.vo;


import com.scs.web.blog.domain.dto.SimpleUser;
import com.scs.web.blog.entity.Article;
import com.scs.web.blog.entity.User;
import lombok.Data;

import java.util.List;
/**
 * @author wenjie_lin
 * @ClassName UserVo
 * @Description 用户视图类，包括用户自身信息、发表的所有文章、所有粉丝和关注的人
 * @Data 2019/11/18
 * @Version 1.0
 **/

@Data
public class UserVo {
    private User user;
    private List<Article> articles;
    private List<SimpleUser> simpleUsers;
}