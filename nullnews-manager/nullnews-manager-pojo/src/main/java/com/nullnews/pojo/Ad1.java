package com.nullnews.pojo;

import java.io.Serializable;

public class Ad1 implements Serializable {
    private String adId;

    private String adTitle;

    private String adUrl;

    private String adPicture;

    private static final long serialVersionUID = 1L;

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    public String getAdPicture() {
        return adPicture;
    }

    public void setAdPicture(String adPicture) {
        this.adPicture = adPicture;
    }
}