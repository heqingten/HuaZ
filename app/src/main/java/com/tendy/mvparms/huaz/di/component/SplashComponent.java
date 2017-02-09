package com.tendy.mvparms.huaz.di.component;

import com.jess.arms.di.scope.ActivityScope;
import com.tendy.mvparms.huaz.di.module.SplashModule;
import com.tendy.mvparms.huaz.mvp.ui.activity.SplashActivity;

import common.AppComponent;
import dagger.Component;

/**
 * Created by Administrator on 2017/2/9 0009.
 */
@ActivityScope
@Component(modules = SplashModule.class, dependencies = AppComponent.class)
public interface SplashComponent {
    void inject(SplashActivity activity);
}
