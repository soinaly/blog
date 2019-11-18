package com.scs.web.blog.domain.dto;

import lombok.Data;

import java.util.List;
/**
 * @author wenjie_lin
 * @ClassName Province
 * @Description 省，level为1
 * @Data 2019/11/18
 * @Version 1.0
 **/
@Data
public class Province {
    private String name;
    private String level;
    private String code;
    private List<City> cities;
}