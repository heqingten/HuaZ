package com.tendy.mvparms.huaz.di.module;

import com.jess.arms.di.scope.ActivityScope;
import com.tendy.mvparms.huaz.mvp.contract.SplashContract;
import com.tendy.mvparms.huaz.mvp.model.SplashModel;

import dagger.Module;
import dagger.Provides;
@Module
public class SplashModule {
    private SplashContract.View view;

    public SplashModule(SplashContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    SplashContract.View provideSplashView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    SplashContract.Model provideSplashModel(SplashModel model) {
        return model;
    }
}
