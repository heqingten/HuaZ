package com.tendy.mvparms.huaz.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.jess.arms.widget.imageloader.ImageLoader;
import com.jess.arms.widget.imageloader.glide.GlideImageConfig;
import com.tendy.mvparms.huaz.di.component.DaggerSplashComponent;
import com.tendy.mvparms.huaz.di.component.DaggerUserComponent;
import com.tendy.mvparms.huaz.di.module.SplashModule;
import com.tendy.mvparms.huaz.mvp.contract.SplashContract;
import com.tendy.mvparms.huaz.mvp.model.entity.CommonImgUrl;
import com.tendy.mvparms.huaz.mvp.presenter.SplashPresent;

import butterknife.BindView;
import common.AppComponent;
import common.WEActivity;
import me.jessyan.mvparms.demo.R;


public class SplashActivity extends WEActivity<SplashPresent> implements SplashContract.View {
    @BindView(R.id.iv_load)
    ImageView ivLoad;
    @BindView(R.id.fl_welcome)
    RelativeLayout flWelcome;

    private boolean isAnimationEnd = false;

    @Nullable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerSplashComponent
                .builder()
                .appComponent(appComponent)
                .splashModule(new SplashModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected View initView() {
        return LayoutInflater.from(this).inflate(R.layout.activity_splash, null);
    }

    @Override
    protected void initData() {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.splash_anim);
        ivLoad.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                isAnimationEnd = true;
//                startActivity(new Intent(mApplication, UserActivity.class));
            }
        });
        mPresenter.getImgs();
    }

    @Override
    public void tt(CommonImgUrl commonImgUrl) {
        ImageLoader mImageLoader = mWeApplication.getAppComponent().imageLoader();
        mImageLoader.loadImage(mApplication, GlideImageConfig.builder().url(commonImgUrl.getUrl()).imagerView(ivLoad).build());
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void launchActivity(Intent intent) {

    }

    @Override
    public void killMyself() {

    }
}
