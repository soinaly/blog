package com.scs.web.blog.domain.dto;

import lombok.Data;
/**
 * @author wenjie_lin
 * @ClassName Address
 * @Description 地址类，由省和市组成
 * @Data 2019/11/18
 * @Version 1.0
 **/
@Data
public class Address {
    private String province;
    private String city;
}