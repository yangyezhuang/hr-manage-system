package com.yyz.hrms.entity;

import lombok.Data;

/**
 * (Teacher)实体类
 */
@Data
public class Teacher {
    /**
     * 工号
     */
    private Integer tchId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 出生年份
     */
    private String year;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 职称号
     */
    private Integer postId;
    /**
     * 部门号
     */
    private Integer departId;

}

