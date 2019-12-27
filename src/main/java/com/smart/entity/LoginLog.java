package com.smart.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TLoginLog)实体类
 *
 * @author Chaos
 * @since 2019-08-12 11:50:31
 */
public class LoginLog implements Serializable {
    private static final long serialVersionUID = -19708983444590179L;
    
    private Integer loginLogId;
    
    private Integer userId;
    
    private String ip;
    
    private Date loginDatetime;


    public Integer getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(Integer loginLogId) {
        this.loginLogId = loginLogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDatetime() {
        return loginDatetime;
    }

    public void setLoginDatetime(Date loginDatetime) {
        this.loginDatetime = loginDatetime;
    }

}