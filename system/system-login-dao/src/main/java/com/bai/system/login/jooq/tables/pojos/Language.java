/*
 * This file is generated by jOOQ.
*/
package com.bai.system.login.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 国际化语言表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Language implements Serializable {

    private static final long serialVersionUID = -709755355;

    private String languageId;
    private String languageCode;
    private String zhCn;
    private String enUs;

    public Language() {}

    public Language(Language value) {
        this.languageId = value.languageId;
        this.languageCode = value.languageCode;
        this.zhCn = value.zhCn;
        this.enUs = value.enUs;
    }

    public Language(
        String languageId,
        String languageCode,
        String zhCn,
        String enUs
    ) {
        this.languageId = languageId;
        this.languageCode = languageCode;
        this.zhCn = zhCn;
        this.enUs = enUs;
    }

    public String getLanguageId() {
        return this.languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getZhCn() {
        return this.zhCn;
    }

    public void setZhCn(String zhCn) {
        this.zhCn = zhCn;
    }

    public String getEnUs() {
        return this.enUs;
    }

    public void setEnUs(String enUs) {
        this.enUs = enUs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Language (");

        sb.append(languageId);
        sb.append(", ").append(languageCode);
        sb.append(", ").append(zhCn);
        sb.append(", ").append(enUs);

        sb.append(")");
        return sb.toString();
    }
}
