package com.soft2242.shop.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    UNAUTHORIZED(401,"登录失败，请重新登录"),
    INTERNAL_SERVER_ERROR(500,"服务器异常,请稍后再试");
    private final int code;
    private final String msg;
}
