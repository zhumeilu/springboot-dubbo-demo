package com.lmhd.common.exception;

/**
 * @Auther: zhumeilu
 * @Date: 2019/10/8 10:25
 * @Description:
 */
public class LmhdException extends RuntimeException {

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LmhdException() {
        super();
    }

    public LmhdException(String code,String message) {
        super(message);
        this.code = code;
    }

    public LmhdException(String code,String message,Throwable cause) {
        this(message,cause);
        this.code = code;
    }

    public LmhdException(String message) {
        super(message);
    }
    public LmhdException(Throwable cause) {
        super(cause);
    }
    public LmhdException(String message,Throwable cause) {
        super(message,cause);
    }
}
