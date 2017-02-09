package com.tendy.mvparms.huaz.mvp.model;

import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BaseModel;
import com.tendy.mvparms.huaz.mvp.contract.SplashContract;
import com.tendy.mvparms.huaz.mvp.model.api.cache.CacheManager;
import com.tendy.mvparms.huaz.mvp.model.api.service.ServiceManager;
import com.tendy.mvparms.huaz.mvp.model.entity.CommonImgUrlResponse;

import javax.inject.Inject;

import rx.Observable;
@ActivityScope
public class SplashModel extends BaseModel<ServiceManager, CacheManager> implements SplashContract.Model {
    @Inject
    public SplashModel(ServiceManager serviceManager, CacheManager cacheManager) {
        super(serviceManager, cacheManager);
    }

    @Override
    public Observable<CommonImgUrlResponse> getImgs() {
        return mServiceManager.getSplashService().getImgs();
    }
}
