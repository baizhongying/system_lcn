package com.bai.system.login.dao;

import com.bai.system.login.bo.Language;
import lombok.extern.slf4j.Slf4j;
import org.jooq.Condition;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.SelectJoinStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.bai.system.login.jooq.Tables.LANGUAGE;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 10:43 2018/11/16
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
@Slf4j
@Repository
public class LanguageDao extends com.bai.system.login.jooq.tables.daos.LanguageDao {

    public LanguageDao(@Autowired Configuration configuration) {
        super(configuration);
    }

    @Autowired
    private DSLContext dslContext;

    public Language selectLanguageByCode(String languageCode) {
        SelectJoinStep selectJoinStep = dslContext.select(LANGUAGE.fields())
                .from(LANGUAGE);
        List<Condition> conditions = new ArrayList<>();
        conditions.add(LANGUAGE.LANGUAGE_CODE.eq(languageCode));
        selectJoinStep.where(conditions);
        log.info(selectJoinStep.toString());
        selectJoinStep.limit(1);
        return (Language) selectJoinStep.fetchOneInto(Language.class);
    }
}
