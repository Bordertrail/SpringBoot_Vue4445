package com.woniu.springboot_vue.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName account
 */
@Data
public class Account implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String accountName;

    /**
     * 
     */
    private Integer accountNo;

    /**
     * 
     */
    private Integer accountBalance;

    private static final long serialVersionUID = 1L;
}