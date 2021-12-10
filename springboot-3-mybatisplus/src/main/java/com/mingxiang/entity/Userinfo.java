package com.mingxiang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 表注释
 * </p>
 *
 * @author MX
 * @since 2021-12-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Userinfo extends Model<Userinfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 地址
     */
    private String address;

    /**
     * 年纪
     */
    private Integer age;

    /**
     * 生日
     */
    private LocalDateTime birthday;

    /**
     * 创建日期
     */
    private LocalDateTime createTime;

    /**
     * 是否删除
     */
    private LocalDateTime delFlag;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 最新更新时间
     */
    private LocalDateTime updateTime;


}
