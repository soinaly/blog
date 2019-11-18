package com.scs.web.blog.domain.dto;

import lombok.Data;
/**
 * @author wenjie_lin
 * @ClassName City
 * @Description 城市类，省会城市level为2，其余地级市level为3
 * @Data 2019/11/18
 * @Version 1.0
 **/
@Data
public class City {
    private String name;
    private String level;
    private String code;
}