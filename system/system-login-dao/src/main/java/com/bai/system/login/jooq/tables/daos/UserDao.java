/*
 * This file is generated by jOOQ.
*/
package com.bai.system.login.jooq.tables.daos;


import com.bai.system.login.jooq.tables.records.UserRecord;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserDao extends DAOImpl<UserRecord, com.bai.system.login.jooq.tables.pojos.User, String> {

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(com.bai.system.login.jooq.tables.User.USER, com.bai.system.login.jooq.tables.pojos.User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    public UserDao(Configuration configuration) {
        super(com.bai.system.login.jooq.tables.User.USER, com.bai.system.login.jooq.tables.pojos.User.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(com.bai.system.login.jooq.tables.pojos.User object) {
        return object.getUserId();
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.bai.system.login.jooq.tables.pojos.User> fetchByUserId(String... values) {
        return fetch(com.bai.system.login.jooq.tables.User.USER.USER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>user_id = value</code>
     */
    public com.bai.system.login.jooq.tables.pojos.User fetchOneByUserId(String value) {
        return fetchOne(com.bai.system.login.jooq.tables.User.USER.USER_ID, value);
    }

    /**
     * Fetch records that have <code>user_name IN (values)</code>
     */
    public List<com.bai.system.login.jooq.tables.pojos.User> fetchByUserName(String... values) {
        return fetch(com.bai.system.login.jooq.tables.User.USER.USER_NAME, values);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<com.bai.system.login.jooq.tables.pojos.User> fetchByPassword(String... values) {
        return fetch(com.bai.system.login.jooq.tables.User.USER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>created_user_id IN (values)</code>
     */
    public List<com.bai.system.login.jooq.tables.pojos.User> fetchByCreatedUserId(String... values) {
        return fetch(com.bai.system.login.jooq.tables.User.USER.CREATED_USER_ID, values);
    }

    /**
     * Fetch records that have <code>created_date IN (values)</code>
     */
    public List<com.bai.system.login.jooq.tables.pojos.User> fetchByCreatedDate(LocalDateTime... values) {
        return fetch(com.bai.system.login.jooq.tables.User.USER.CREATED_DATE, values);
    }

    /**
     * Fetch records that have <code>updated_user_id IN (values)</code>
     */
    public List<com.bai.system.login.jooq.tables.pojos.User> fetchByUpdatedUserId(String... values) {
        return fetch(com.bai.system.login.jooq.tables.User.USER.UPDATED_USER_ID, values);
    }

    /**
     * Fetch records that have <code>updated_date IN (values)</code>
     */
    public List<com.bai.system.login.jooq.tables.pojos.User> fetchByUpdatedDate(LocalDateTime... values) {
        return fetch(com.bai.system.login.jooq.tables.User.USER.UPDATED_DATE, values);
    }
}
