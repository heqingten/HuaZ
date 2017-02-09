package com.tendy.mvparms.huaz.mvp.model.entity;

import java.io.Serializable;
import java.util.List;

public class CommonImgUrlResponse implements Serializable {

    private final  boolean success;
    private final int code;
    private final String msg;
    private final  CommonImgUrl about;//关于我们图
    private final CommonImgUrl ad;//广告图
    private final CommonImgUrl dz;//定制图
    private final CommonImgUrl loading;//启动图
    private final List<CommonImgUrl> index;//数组，最多包含6张图片

    public CommonImgUrlResponse(boolean success, int code, String msg, CommonImgUrl about, CommonImgUrl ad, CommonImgUrl dz, CommonImgUrl loading, List<CommonImgUrl> index) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.about = about;
        this.ad = ad;
        this.dz = dz;
        this.loading = loading;
        this.index = index;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public CommonImgUrl getAbout() {
        return about;
    }

    public CommonImgUrl getAd() {
        return ad;
    }

    public CommonImgUrl getDz() {
        return dz;
    }

    public CommonImgUrl getLoading() {
        return loading;
    }

    public List<CommonImgUrl> getIndex() {
        return index;
    }
}
