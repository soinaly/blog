package com.scs.web.blog.domain.vo;


import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author wenjie_lin
 * @ClassName ArticleVo
 * @Description 文章视图类,从文章、专题、用户表联查出前端需要展示的数据
 * @Data 2019/11/18
 * @Version 1.0
 **/
@Data
public class ArticleVo  {
    private Long id;
    private Long userId;
    private Long topicId;
    private String nickname;
    private String avatar;
    private String name;
    private String logo;
    private String title;
    private String summary;
    private String thumbnail;
    private Integer likes;
    private Integer comments;
    private LocalDateTime createTime;
}