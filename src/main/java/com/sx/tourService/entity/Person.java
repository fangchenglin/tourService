package com.sx.tourService.entity;

import java.io.Serializable;

/**
 * (Person)实体类
 *
 * @author makejava
 * @since 2023-07-04 17:12:20
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 635667863446439086L;
    
    private Integer pId;
    
    private String pName;
    /**
     * 0：未登录用户  1：游客  2：处理  3：管理  4：审批 5：酒店
     */
    private Integer pPower;
    
    private String pPhone;
    
    private String password;


    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public Integer getPPower() {
        return pPower;
    }

    public void setPPower(Integer pPower) {
        this.pPower = pPower;
    }

    public String getPPhone() {
        return pPhone;
    }

    public void setPPhone(String pPhone) {
        this.pPhone = pPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

