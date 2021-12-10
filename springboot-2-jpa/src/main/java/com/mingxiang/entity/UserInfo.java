package com.mingxiang.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author mx
 * @date 2021-12-09 14:47
 */

@Entity
//@Entity注解标识了UserInfo类是一个持久化的实体
@org.hibernate.annotations.Table(appliesTo = "UserInfo",comment="表注释")   //@Table的“appliesTo”的值与@Entity的“name”能够匹配上
@Data
@NoArgsConstructor
//@Data和@NoArgsConstructor是Lombok中的注解。用来自动生成各参数的Set、Get函数以及不带参数的构造函数。如果您对Lombok还不了解
public class UserInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false,columnDefinition="bigint(20) COMMENT '主键id'")
//    @Id和@GeneratedValue用来标识User对应对应数据库表中的主键
    Long id;

    @Column(name="age",columnDefinition="int(3) COMMENT '年纪'")
    Integer age;

    @Column(name="name",columnDefinition="varchar(50) COMMENT '姓名'")
    String name;

    @Column(name="password",columnDefinition="varchar(50) COMMENT '密码'")
    String password;

    @Column(name="address",columnDefinition="varchar(255) COMMENT '地址'")
    String address;

    @Column(name="birthday",columnDefinition="datetime COMMENT '生日'")
    LocalDateTime birthday;

    @Column(name="del_flag",columnDefinition="datetime COMMENT '是否删除'")
    Integer delFlag;

    @Column(name="create_time",columnDefinition="datetime COMMENT '创建日期'")
    LocalDateTime createTime;

    @Column(name="update_time",columnDefinition="datetime COMMENT '最新更新时间'")
    LocalDateTime updateTime;

    public UserInfo(String name, Integer age) {
        this.age = age;
        this.name = name;
    }
}



