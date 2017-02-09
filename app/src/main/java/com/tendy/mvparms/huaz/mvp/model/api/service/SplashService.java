package com.tendy.mvparms.huaz.mvp.model.api.service;

import com.tendy.mvparms.huaz.mvp.model.entity.CommonImgUrlResponse;


import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Administrator on 2017/2/9 0009.
 */

public interface SplashService {
    @POST("page/index.json")
    Observable<CommonImgUrlResponse> getImgs();
}
