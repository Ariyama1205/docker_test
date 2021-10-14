package com.bk.exception;


/**
 * @author yunlong.huang
 * @date 2020-09-03
 */
public class ValidatorException extends RuntimeException {
    public ValidatorException(String message) {
        super(message);
    }

    public ValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidatorException(Throwable cause) {
        super(cause);
    }

    public ValidatorException(String msg, Object... args) {
        super(String.format(msg, args));
    }

    protected ValidatorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
