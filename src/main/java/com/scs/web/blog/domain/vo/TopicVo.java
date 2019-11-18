package com.scs.web.blog.domain.vo;


import com.scs.web.blog.domain.dto.SimpleUser;
import com.scs.web.blog.entity.Article;
import com.scs.web.blog.entity.Topic;
import lombok.Data;

import java.util.List;

/**
 * @author wenjie_lin
 * @ClassName TopicVo
 * @Description 专题视图类, 包含专题自身信息、专题下所有文章、创建者信息(简略)、关注者信息(简略)
 * @Data 2019/11/18
 * @Version 1.0
 **/
@Data
public class TopicVo {
    private Topic topic;
    private List<Article> articles;
    private SimpleUser simpleUser;
    private List<SimpleUser> simpleUsers;
}