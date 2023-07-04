package com.sx.tourService.entity;

import java.io.Serializable;

/**
 * (Room)实体类
 *
 * @author makejava
 * @since 2023-07-04 15:26:33
 */
public class Room implements Serializable {
    private static final long serialVersionUID = 908999428209319215L;
    
    private Integer rId;
    
    private Integer capcity;
    
    private Integer state;
    
    private Integer pId;
    
    private Integer price;
    
    private Integer hId;


    public Integer getRId() {
        return rId;
    }

    public void setRId(Integer rId) {
        this.rId = rId;
    }

    public Integer getCapcity() {
        return capcity;
    }

    public void setCapcity(Integer capcity) {
        this.capcity = capcity;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getHId() {
        return hId;
    }

    public void setHId(Integer hId) {
        this.hId = hId;
    }

}

