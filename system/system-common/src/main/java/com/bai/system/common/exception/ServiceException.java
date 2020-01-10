package com.bai.system.common.exception;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 18:51 2018/10/26
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
public class ServiceException extends Exception{


    public ServiceException(String s) {
        super(s);
    }

    public ServiceException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ServiceException(Throwable throwable) {
        super(throwable);
    }

    protected ServiceException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }

}
