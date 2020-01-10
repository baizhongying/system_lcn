/*
 * This file is generated by jOOQ.
*/
package com.bai.system.login.jooq;


import com.bai.system.login.jooq.tables.Language;
import com.bai.system.login.jooq.tables.User;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>system</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index LANGUAGE_PRIMARY = Indexes0.LANGUAGE_PRIMARY;
    public static final Index USER_PRIMARY = Indexes0.USER_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index LANGUAGE_PRIMARY = Internal.createIndex("PRIMARY", Language.LANGUAGE, new OrderField[] { Language.LANGUAGE.LANGUAGE_ID }, true);
        public static Index USER_PRIMARY = Internal.createIndex("PRIMARY", User.USER, new OrderField[] { User.USER.USER_ID }, true);
    }
}