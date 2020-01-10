package com.bai.system.common.exception;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 18:51 2018/10/26
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
public class RequestException extends Exception{


    public RequestException(String s) {
        super(s);
    }

    public RequestException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public RequestException(Throwable throwable) {
        super(throwable);
    }

    protected RequestException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }

}
