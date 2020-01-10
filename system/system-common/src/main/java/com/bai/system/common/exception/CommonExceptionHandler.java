package com.bai.system.common.exception;

import com.bai.system.common.entity.ResultData;
import com.bai.system.common.message.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 19:11 2018/10/26
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
@ControllerAdvice
public class CommonExceptionHandler {

    @Autowired
    MessageService messageService;

    /**
     * 拦截Exception类的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ResultData exceptionHandler(Exception e) {
        e.printStackTrace();
        ResultData resultData = new ResultData();
        resultData.setStatus("SYSTEM_ERROR");
        resultData.setStatusName(messageService.getMessage("system.error"));
        resultData.setData(messageService.getMessage("system.error"));
        return resultData;
    }

    /**
     * 拦截RequestException类的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(RequestException.class)
    @ResponseBody
    public ResultData requestExceptionHandler(RequestException e) {
        e.printStackTrace();
        ResultData resultData = new ResultData();
        resultData.setStatus("PARAMS_ERROR");
        resultData.setStatusName(messageService.getMessage("params.error"));
        resultData.setData(e.getMessage());
        return resultData;
    }

    /**
     * 拦截RequestException类的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public ResultData requestExceptionHandler(ServiceException e) {
        e.printStackTrace();
        ResultData resultData = new ResultData();
        resultData.setStatus("SERVICE_ERROR");
        resultData.setStatusName(messageService.getMessage("service.error"));
        String message = messageService.getMessage(e.getMessage());
        resultData.setData(message);
        return resultData;
    }


}
