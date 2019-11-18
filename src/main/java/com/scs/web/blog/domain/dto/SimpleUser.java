package com.scs.web.blog.domain.dto;
import lombok.Data;
/**
 * @author wenjie_lin
 * @ClassName SimpleUser
 * @Description 简单的用户类，在关注专辑或用户的显示区域，只有id、头像、昵称
 * @Data 2019/11/18
 * @Version 1.0
 **/

@Data
public class SimpleUser {
    private Long id;
    private String nickname;
    private String avatar;
}