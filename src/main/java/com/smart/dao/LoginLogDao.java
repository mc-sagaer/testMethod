package com.smart.dao;

import com.smart.entity.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginLogDao {
    private JdbcTemplate jdbcTemplate;
    private  final static String INSERT_LOGIN_LOG_SQL="insert into t_login_log(user_id,ip,login_datetime) VALUES(?,?,?)";

    public void  insterLoginLog(LoginLog loginLog){
        Object[] args ={ loginLog.getUserId(),loginLog.getIp(),loginLog.getLoginDatetime()};
        jdbcTemplate.update(INSERT_LOGIN_LOG_SQL,args);
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
}
