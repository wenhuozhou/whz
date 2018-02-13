package com.whz.model.sys;

import java.util.Date;

public class User {
    private Integer id;

    private String account;

    private String password;

    private String name;

    private Boolean useStatus;

    private String description;

    private Date gmtCreate;

    private Date gmtModfied;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Boolean useStatus) {
        this.useStatus = useStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModfied() {
        return gmtModfied;
    }

    public void setGmtModfied(Date gmtModfied) {
        this.gmtModfied = gmtModfied;
    }
}