package com.tendy.mvparms.huaz.mvp.presenter;

import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.utils.RxUtils;
import com.tendy.mvparms.huaz.mvp.contract.SplashContract;
import com.tendy.mvparms.huaz.mvp.model.entity.CommonImgUrlResponse;

import javax.inject.Inject;

import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@ActivityScope
public class SplashPresent extends BasePresenter<SplashContract.Model, SplashContract.View> {
    private RxErrorHandler mErrorHandler;

    @Inject
    public SplashPresent(SplashContract.Model model, SplashContract.View view, RxErrorHandler mErrorHandler) {
        super(model, view);
        this.mErrorHandler = mErrorHandler;
    }

    public void getImgs() {
        mModel.getImgs()
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        mRootView.showLoading();
                    }
                }).subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doAfterTerminate(new Action0() {
                    @Override
                    public void call() {
                        mRootView.hideLoading();
                    }
                })
                .compose(RxUtils.<CommonImgUrlResponse>bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<CommonImgUrlResponse>(mErrorHandler) {
                    @Override
                    public void onNext(CommonImgUrlResponse response) {
                        mRootView.tt(response.getLoading());
                    }
                });
    }
}
