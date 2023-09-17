package com.yyz.hrms.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * (User)实体类
 *
 * @author YZ.YANG
 * @date 2023-09-08 20:18:24
 */
@Data
@NoArgsConstructor
public class User {

    private Integer id;

    private String username;

    private String password;

    private String salt;

    private String email;

    private String activationCode;

    private String headerUrl;

    private Date createTime;

}

