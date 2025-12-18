package com.cinema.common.exception;

public class BusinessException extends BaseException {
    public BusinessException(String code, String message) {
        super(400, code, message);
    }
}
