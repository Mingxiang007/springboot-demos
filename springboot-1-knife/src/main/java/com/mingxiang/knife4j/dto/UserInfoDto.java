package com.mingxiang.knife4j.dto;

import com.mingxiang.entity.UserInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author mx
 * @date 2021-12-09 14:34
 */

@Data
@ApiModel(value = "用户信息DTO")
@ToString
public class UserInfoDto extends UserInfo {
    @ApiModelProperty(value = "生日范围-开始")
    LocalDateTime birthdayFrom;

    @ApiModelProperty(value = "生日范围-截止")
    LocalDateTime birthdayTo;
}



