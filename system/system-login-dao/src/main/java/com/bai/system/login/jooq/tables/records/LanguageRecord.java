/*
 * This file is generated by jOOQ.
*/
package com.bai.system.login.jooq.tables.records;


import com.bai.system.login.jooq.tables.Language;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class LanguageRecord extends UpdatableRecordImpl<LanguageRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = -1748315005;

    /**
     * Setter for <code>system.language.language_id</code>. 语言Id
     */
    public void setLanguageId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>system.language.language_id</code>. 语言Id
     */
    public String getLanguageId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>system.language.language_code</code>. 语言编码
     */
    public void setLanguageCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>system.language.language_code</code>. 语言编码
     */
    public String getLanguageCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>system.language.zh_cn</code>. 中文语言
     */
    public void setZhCn(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>system.language.zh_cn</code>. 中文语言
     */
    public String getZhCn() {
        return (String) get(2);
    }

    /**
     * Setter for <code>system.language.en_us</code>. 英文语言
     */
    public void setEnUs(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>system.language.en_us</code>. 英文语言
     */
    public String getEnUs() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Language.LANGUAGE.LANGUAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Language.LANGUAGE.LANGUAGE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Language.LANGUAGE.ZH_CN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Language.LANGUAGE.EN_US;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getLanguageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getLanguageCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getZhCn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEnUs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getLanguageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLanguageCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getZhCn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEnUs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LanguageRecord value1(String value) {
        setLanguageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LanguageRecord value2(String value) {
        setLanguageCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LanguageRecord value3(String value) {
        setZhCn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LanguageRecord value4(String value) {
        setEnUs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LanguageRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LanguageRecord
     */
    public LanguageRecord() {
        super(Language.LANGUAGE);
    }

    /**
     * Create a detached, initialised LanguageRecord
     */
    public LanguageRecord(String languageId, String languageCode, String zhCn, String enUs) {
        super(Language.LANGUAGE);

        set(0, languageId);
        set(1, languageCode);
        set(2, zhCn);
        set(3, enUs);
    }
}
