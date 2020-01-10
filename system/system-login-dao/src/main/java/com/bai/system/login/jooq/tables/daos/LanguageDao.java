/*
 * This file is generated by jOOQ.
*/
package com.bai.system.login.jooq.tables.daos;


import com.bai.system.login.jooq.tables.Language;
import com.bai.system.login.jooq.tables.records.LanguageRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class LanguageDao extends DAOImpl<LanguageRecord, com.bai.system.login.jooq.tables.pojos.Language, String> {

    /**
     * Create a new LanguageDao without any configuration
     */
    public LanguageDao() {
        super(Language.LANGUAGE, com.bai.system.login.jooq.tables.pojos.Language.class);
    }

    /**
     * Create a new LanguageDao with an attached configuration
     */
    public LanguageDao(Configuration configuration) {
        super(Language.LANGUAGE, com.bai.system.login.jooq.tables.pojos.Language.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(com.bai.system.login.jooq.tables.pojos.Language object) {
        return object.getLanguageId();
    }

    /**
     * Fetch records that have <code>language_id IN (values)</code>
     */
    public List<com.bai.system.login.jooq.tables.pojos.Language> fetchByLanguageId(String... values) {
        return fetch(Language.LANGUAGE.LANGUAGE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>language_id = value</code>
     */
    public com.bai.system.login.jooq.tables.pojos.Language fetchOneByLanguageId(String value) {
        return fetchOne(Language.LANGUAGE.LANGUAGE_ID, value);
    }

    /**
     * Fetch records that have <code>language_code IN (values)</code>
     */
    public List<com.bai.system.login.jooq.tables.pojos.Language> fetchByLanguageCode(String... values) {
        return fetch(Language.LANGUAGE.LANGUAGE_CODE, values);
    }

    /**
     * Fetch records that have <code>zh_cn IN (values)</code>
     */
    public List<com.bai.system.login.jooq.tables.pojos.Language> fetchByZhCn(String... values) {
        return fetch(Language.LANGUAGE.ZH_CN, values);
    }

    /**
     * Fetch records that have <code>en_us IN (values)</code>
     */
    public List<com.bai.system.login.jooq.tables.pojos.Language> fetchByEnUs(String... values) {
        return fetch(Language.LANGUAGE.EN_US, values);
    }
}
