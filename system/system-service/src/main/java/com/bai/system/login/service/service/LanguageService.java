package com.bai.system.login.service.service;

import com.bai.system.login.service.response.LanguageResponse;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 10:35 2018/11/16
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
public interface LanguageService {

    /**
     * 获取语言
     *
     * @return
     */
    LanguageResponse selectLanguage(String languageCode);

}
