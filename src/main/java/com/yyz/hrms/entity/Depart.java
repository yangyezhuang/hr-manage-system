package com.yyz.hrms.entity;

import lombok.Data;


/**
 * (Depart)实体类
 */
@Data
public class Depart   {
    /**
     * 编号
     */
    private Integer departId;
    /**
     * 部门
     */
    private String depart;
    /**
     * 人数
     */
    private String peopleNum;

}

