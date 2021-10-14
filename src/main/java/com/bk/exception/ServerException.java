package com.bk.exception;

/**
 * Service layer general exceptions
 *
 * @author shengyong.huang
 * @date 2018/9/20
 */
public class ServerException extends RuntimeException {
    private static final long serialVersionUID = -6206174037814409008L;

    public ServerException(String msg) {
        super(msg);
    }

    public ServerException(String msg, Object... args) {
        super(String.format(msg, args));
    }

    public ServerException() {
        super();
    }
}
