package com.yyz.hrms.entity;

import lombok.Data;

/**
 * (Record)实体类
 */
@Data
public class Record   {
    /**
     * ID
     */
    private Integer id;
    /**
     * 工号
     */
    private Integer tchId;
    /**
     * 小学
     */
    private String prim;
    /**
     * 初中
     */
    private String juniorHigh;
    /**
     * 高中
     */
    private String high;
    /**
     * 大学
     */
    private String university;
    /**
     * 硕士
     */
    private String postgraduate;
    /**
     * 博士
     */
    private String doctor;

}

