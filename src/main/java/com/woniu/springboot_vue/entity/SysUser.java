package com.woniu.springboot_vue.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName sys_user
 */
@Data
public class SysUser implements Serializable {

    private String compile;

    private String dname;
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String telephone;

    /**
     * 
     */
    private String realname;

    /**
     * 
     */
    private Date birthday;

    /**
     * 
     */
    private String headimg;

    /**
     * 
     */
    private Integer available;

    /**
     * 
     */
    private Integer did;

    private static final long serialVersionUID = 1L;
}