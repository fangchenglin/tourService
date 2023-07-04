package com.sx.tourService.entity;

import java.io.Serializable;

/**
 * (EmergeMsg)实体类
 *
 * @author makejava
 * @since 2023-07-04 15:16:26
 */
public class EmergeMsg implements Serializable {
    private static final long serialVersionUID = -88197202155327211L;
    
    private Integer mId;
    
    private String mContext;


    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public String getMContext() {
        return mContext;
    }

    public void setMContext(String mContext) {
        this.mContext = mContext;
    }

}

