package com.bai.system.login.service.controller;

import com.bai.system.common.entity.ResultData;
import com.bai.system.login.service.response.LanguageResponse;
import com.bai.system.login.service.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 10:31 2018/11/16
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
@Controller
@RequestMapping("language/")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @RequestMapping(value = "select", method = RequestMethod.GET)
    @ResponseBody
    public ResultData selectLanguage(@RequestParam(name = "languageCode") String languageCode) {
        LanguageResponse languageResponse = languageService.selectLanguage(languageCode);
        ResultData resultData = new ResultData();
        resultData.setData(languageResponse);
        return resultData;
    }
}
