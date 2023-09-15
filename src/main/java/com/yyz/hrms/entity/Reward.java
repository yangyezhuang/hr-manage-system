package com.yyz.hrms.entity;

import lombok.Data;

import java.util.Date;

/**
 * (Reward)实体类
 */
@Data
public class Reward   {
    /**
     * 编号
     */
    private Integer id;
    /**
     * 工号
     */
    private Integer tchId;
    /**
     * 日期
     */
    private Date date;
    /**
     * 奖励
     */
    private String reward;
    /**
     * 惩罚
     */
    private String punish;

}

