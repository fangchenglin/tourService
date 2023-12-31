package com.sx.tourService.entity;

import java.io.Serializable;

/**
 * (Hotel)实体类
 *
 * @author makejava
 * @since 2023-07-04 15:26:05
 */
public class Hotel implements Serializable {
    private static final long serialVersionUID = 339650626765839129L;
    
    private Integer hId;
    
    private String hName;
    
    private String hPhone;
    
    private String hSite;
    
    private Integer hClass;


    public Integer getHId() {
        return hId;
    }

    public void setHId(Integer hId) {
        this.hId = hId;
    }

    public String getHName() {
        return hName;
    }

    public void setHName(String hName) {
        this.hName = hName;
    }

    public String getHPhone() {
        return hPhone;
    }

    public void setHPhone(String hPhone) {
        this.hPhone = hPhone;
    }

    public String getHSite() {
        return hSite;
    }

    public void setHSite(String hSite) {
        this.hSite = hSite;
    }

    public Integer getHClass() {
        return hClass;
    }

    public void setHClass(Integer hClass) {
        this.hClass = hClass;
    }

}

