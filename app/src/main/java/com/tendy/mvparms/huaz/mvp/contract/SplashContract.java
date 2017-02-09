package com.tendy.mvparms.huaz.mvp.contract;

import com.jess.arms.mvp.BaseView;
import com.jess.arms.mvp.IModel;
import com.tendy.mvparms.huaz.mvp.model.entity.CommonImgUrl;
import com.tendy.mvparms.huaz.mvp.model.entity.CommonImgUrlResponse;

import rx.Observable;

public interface SplashContract {
    interface View extends BaseView {
        void tt(CommonImgUrl commonImgUrl);
    }

    //Model层定义接口,外部只需关心model返回的数据,无需关心内部细节,及是否使用缓存
    interface Model extends IModel {
        Observable<CommonImgUrlResponse> getImgs();
    }
}
