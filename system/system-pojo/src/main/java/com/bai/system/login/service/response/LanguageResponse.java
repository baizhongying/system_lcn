package com.bai.system.login.service.response;

import lombok.Getter;
import lombok.Setter;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 10:36 2018/11/16
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
@Getter
@Setter
public class LanguageResponse {

    /**
     * 语言编码
     */
    private String languageCode;
    /**
     * 语言区域国际化
     */
    private String languageName;

}
