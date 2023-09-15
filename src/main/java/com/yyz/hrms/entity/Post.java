package com.yyz.hrms.entity;

import lombok.Data;

/**
 * (Post)实体类
 */
@Data
public class Post {
    /**
     * 职称号
     */
    private Integer postId;
    /**
     * 职称
     */
    private String postName;
    /**
     * 人数
     */
    private String peopleNum;

}

