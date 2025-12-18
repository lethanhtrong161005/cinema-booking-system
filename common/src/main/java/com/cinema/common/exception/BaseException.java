package com.cinema.common.exception;

import lombok.Getter;

@Getter
public abstract class BaseException extends RuntimeException {
    private final int status;
    private final String code;

    protected BaseException(int status, String code, String message) {
        super(message);
        this.status = status;
        this.code = code;
    }
}
