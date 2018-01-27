package com.whz.model.sys;

import java.io.Serializable;
import java.util.Date;
/**
 * 用户实体类
 * @author wenhz
 * @date 2018-1-27 下午05:53:23
 */
public class User implements Serializable{

	private static final long serialVersionUID = 450218160660078255L;

	private Integer id;

    private String account;

    private String password;

    private String name;

    private Boolean useStatus;

    private Date gmtCreate;

    private Date gmtModfied;

    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", password="
				+ password + ", name=" + name + ", useStatus=" + useStatus
				+ ", gmtCreate=" + gmtCreate + ", gmtModfied=" + gmtModfied
				+ ", description=" + description + "]";
	}
    
}