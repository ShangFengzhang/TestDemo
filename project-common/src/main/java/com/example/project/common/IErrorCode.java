package com.example.project.common;

/**
 * @program: ZsfProject
 * @description: 封装API的错误码
 * @author: Zhang Shangfeng
 * @create: 2020-03-03 11:04
 **/
public interface IErrorCode {
    long getCode();

    String getMessage();
}
