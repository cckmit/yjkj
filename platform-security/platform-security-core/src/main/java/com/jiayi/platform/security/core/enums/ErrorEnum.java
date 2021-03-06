package com.jiayi.platform.security.core.enums;

import lombok.Getter;

@Getter
public enum ErrorEnum {
    UNLOGIN_ERROR(100, "未登录"),
    TOKEN_ERROR(101, "Token过期退出"),
    ARGUMENT_ERROR(400,"请求参数出错"),
    AUTH_ERROR(401, "认证出错"),
    PERMISSION_ERROR(403, "没有资源权限"),
    SERVER_ERROR(500, "服务异常"),
    DB_ERROR(501, "查询数据库出错"),
    VALID_ERROR(500, "数据检验异常");

    private int code;
    private String message;

    ErrorEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
