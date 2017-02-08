package com.tendy.mvparms.huaz.di.component;

import com.jess.arms.di.scope.ActivityScope;
import com.tendy.mvparms.huaz.mvp.ui.activity.UserActivity;

import common.AppComponent;
import dagger.Component;
import com.tendy.mvparms.huaz.di.module.UserModule;

/**
 * Created by jess on 9/4/16 11:17
 * Contact with jess.yan.effort@gmail.com
 */
@ActivityScope
@Component(modules = UserModule.class,dependencies = AppComponent.class)
public interface UserComponent {
    void inject(UserActivity activity);
}
