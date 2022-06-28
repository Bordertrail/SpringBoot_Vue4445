package com.woniu.springboot_vue.util;

import cn.hutool.http.HttpStatus;
import lombok.Data;


import java.util.HashMap;
import java.util.Map;

/**
 * @description 统一返回结果类
 * @author : fengSir
 * @date : 16:08 2021/11/12
 */
@Data
public class Result {

    //是否成功
    private Boolean success;

    //返回码
    private Integer code;

    //返回消息
    private String message;

    //返回数据
    private Map<String, Object> data = new HashMap<String, Object>();

    //把构造方法私有
    private Result() {}

    //成功静态方法
    public static Result ok() {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(HttpStatus.HTTP_OK);
        result.setMessage("成功");
        return result;
    }
    //成功静态方法
    public static Result ok(String msg) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(HttpStatus.HTTP_OK);
        result.setMessage(msg);
        return result;
    }

    //成功静态方法
    public static Result ok(Integer code, String msg) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    //失败静态方法
    public static Result error() {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(HttpStatus.HTTP_BAD_REQUEST);
        result.setMessage("失败");
        return result;
    }
    //失败静态方法
    public static Result error(String msg) {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(HttpStatus.HTTP_BAD_REQUEST);
        result.setMessage(msg);
        return result;
    }

    //失败静态方法
    public static Result error(Integer code , String msg) {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    public Result data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public Result success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    public Result code(Integer code){
        this.setCode(code);
        return this;
    }



    public Result data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
