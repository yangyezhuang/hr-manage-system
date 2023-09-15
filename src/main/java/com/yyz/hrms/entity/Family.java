package com.yyz.hrms.entity;

import lombok.Data;

/**
 * (Family)实体类
 */
@Data
public class Family   {
    /**
     * 编号
     */
    private Integer id;
    /**
     * 工号
     */
    private Integer tchId;
    /**
     * 妻(夫)
     */
    private String wifeHusband;
    /**
     * 父亲
     */
    private String father;
    /**
     * 母亲
     */
    private String mother;
    /**
     * 子女1
     */
    private String son1;
    /**
     * 子女2
     */
    private String son2;
    /**
     * 子女3
     */
    private String son3;

}

