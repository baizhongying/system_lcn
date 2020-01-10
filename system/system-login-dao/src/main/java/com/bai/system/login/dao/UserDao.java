package com.bai.system.login.dao;

import com.bai.system.login.bo.User;
import lombok.extern.slf4j.Slf4j;
import org.jooq.Condition;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.SelectJoinStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.bai.system.login.jooq.Tables.USER;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 10:37 2018/11/14
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
@Slf4j
@Repository
public class UserDao extends com.bai.system.login.jooq.tables.daos.UserDao {

    public UserDao(@Autowired Configuration configuration) {
        super(configuration);
    }

    @Autowired
    private DSLContext dslContext;

    public User fetchByUserNameAndPassword(String username, String password) {
        SelectJoinStep selectJoinStep = dslContext.select(USER.fields())
                .from(USER);
        List<Condition> conditions = new ArrayList<>();
        conditions.add(USER.USER_NAME.eq(username));
        conditions.add(USER.PASSWORD.eq(password));
        selectJoinStep.where(conditions);
        log.info(selectJoinStep.toString());
        return (User) selectJoinStep.fetchOneInto(User.class);
    }
}
