package com.bai.system.login.service.service.impl;

import com.alibaba.fastjson.JSON;
import com.bai.system.login.bo.Language;
import com.bai.system.login.dao.LanguageDao;
import com.bai.system.login.service.response.LanguageResponse;
import com.bai.system.login.service.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 10:35 2018/11/16
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private LanguageDao languageDao;

    @Override
    public LanguageResponse selectLanguage(String languageCode) {

        Language language = languageDao.selectLanguageByCode(languageCode);
        LanguageResponse languageResponse = JSON.parseObject(JSON.toJSONString(language), LanguageResponse.class);

        return languageResponse;
    }
}
