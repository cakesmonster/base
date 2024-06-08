package com.cakemonster.admin.common;

/**
 * IErrorCode
 *
 * @author cakemonster
 * @date 2024/6/8
 */
public interface IErrorCode {

    /**
     * 获取状态码
     *
     * @return 状态码
     */
    long getCode();

    /**
     * 获取信息
     *
     * @return 信息
     */
    String getMessage();
}
