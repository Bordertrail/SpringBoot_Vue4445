package com.woniu.springboot_vue.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sys_dept
 */
@Data
public class SysDept implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String dcode;

    /**
     * 
     */
    private String dname;

    private static final long serialVersionUID = 1L;
}