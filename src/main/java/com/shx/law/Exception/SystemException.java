package com.shx.law.Exception;

/**
 * Created by xuan on 2017/12/23.
 */
public class SystemException extends RuntimeException {
    private String code;
    private String message;


    public SystemException(String message, String code, String message1) {
        super(message);
        this.code = code;
        this.message = message1;
    }

    public SystemException(String message, Throwable cause, String code, String message1) {
        super(message, cause);
        this.code = code;
        this.message = message1;
    }

    public SystemException(Throwable cause, String code, String message) {
        super(cause);
        this.code = code;
        this.message = message;
    }

    public SystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String code, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.message = message1;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
