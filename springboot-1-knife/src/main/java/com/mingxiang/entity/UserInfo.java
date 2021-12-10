package com.mingxiang.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author mx
 * @date 2021-12-09 14:47
 */

@Data
@ApiModel(value = "用户信息")
@ToString
public class UserInfo {
    @ApiModelProperty(value = "数据id")
    Integer id;
    @ApiModelProperty(value = "年纪")
    Integer age;
    @ApiModelProperty(value = "姓名")
    String name;
    @ApiModelProperty(value = "密码")
    String password;
    @ApiModelProperty(value = "地址")
    String address;
    @ApiModelProperty(value = "生日")
    LocalDateTime birthday;
}



