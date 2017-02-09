package com.tendy.mvparms.huaz.mvp.model.entity;

import java.io.Serializable;

public class CommonImgUrl implements Serializable {
    private int id;
    private String link;
    private String title;
    private String type;
    private String url;

    public CommonImgUrl(int id, String link, String url, String title, String type) {
        this.id = id;
        this.link = link;
        this.url = url;
        this.title = title;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }
}
