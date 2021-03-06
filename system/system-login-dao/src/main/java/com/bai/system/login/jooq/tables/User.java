/*
 * This file is generated by jOOQ.
*/
package com.bai.system.login.jooq.tables;


import com.bai.system.login.jooq.Indexes;
import com.bai.system.login.jooq.Keys;
import com.bai.system.login.jooq.System;
import com.bai.system.login.jooq.tables.records.UserRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = 90096579;

    /**
     * The reference instance of <code>system.user</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>system.user.user_id</code>. 用户ID
     */
    public final TableField<UserRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "用户ID");

    /**
     * The column <code>system.user.user_name</code>. 用户名称
     */
    public final TableField<UserRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "用户名称");

    /**
     * The column <code>system.user.password</code>. 用户密码
     */
    public final TableField<UserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(255), this, "用户密码");

    /**
     * The column <code>system.user.created_user_id</code>. 创建用户Id
     */
    public final TableField<UserRecord, String> CREATED_USER_ID = createField("created_user_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "创建用户Id");

    /**
     * The column <code>system.user.created_date</code>. 创建用户时间
     */
    public final TableField<UserRecord, LocalDateTime> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "创建用户时间");

    /**
     * The column <code>system.user.updated_user_id</code>. 修改用户Id
     */
    public final TableField<UserRecord, String> UPDATED_USER_ID = createField("updated_user_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "修改用户Id");

    /**
     * The column <code>system.user.updated_date</code>. 修改用户时间
     */
    public final TableField<UserRecord, LocalDateTime> UPDATED_DATE = createField("updated_date", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "修改用户时间");

    /**
     * Create a <code>system.user</code> table reference
     */
    public User() {
        this(DSL.name("user"), null);
    }

    /**
     * Create an aliased <code>system.user</code> table reference
     */
    public User(String alias) {
        this(DSL.name(alias), USER);
    }

    /**
     * Create an aliased <code>system.user</code> table reference
     */
    public User(Name alias) {
        this(alias, USER);
    }

    private User(Name alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(Name alias, Table<UserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return System.SYSTEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRecord>>asList(Keys.KEY_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(String alias) {
        return new User(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(Name alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(String name) {
        return new User(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(Name name) {
        return new User(name, null);
    }
}
