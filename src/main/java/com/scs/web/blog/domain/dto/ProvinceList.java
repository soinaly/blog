package com.scs.web.blog.domain.dto;

import lombok.Data;

import java.util.List;
/**
 * @author wenjie_lin
 * @ClassName ProvinceList
 * @Description 省份集合，包含了全国所有省市数据
 * @Data 2019/11/18
 * @Version 1.0
 **/


@Data
public class ProvinceList {
    private List<Province> provinceList;
}