package com.bai.system.common.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageService {

    @Autowired
    private MessageSource messageSource;

    /**
     * 根据国际化 id 获取国际化信息 默认用户语言
     *
     * @param id
     * @return
     */
    public String getMessage(String id) {
        Locale locale = LocaleContextHolder.getLocale();
        return this.getMessage(id, null,locale);
    }

    /**
     * 根据国际化 id 语言获取国际化信息
     * @param id
     * @param language
     * @return
     */
    public String getMessage(String id,String language) {
        Locale locale = new Locale(language);
        return this.getMessage(id, null, locale);
    }

    public String getMessage(String code,Object[] args, Locale locale){
        try {
           return messageSource.getMessage(code, args, locale);
        }catch (Exception e){

        }
        return null;
    }
}
