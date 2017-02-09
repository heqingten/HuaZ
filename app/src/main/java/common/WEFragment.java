package common;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.mvp.Presenter;

/**
 * Created by jess on 8/5/16 14:11
 * contact with jess.yan.effort@gmail.com
 */
public abstract class WEFragment<P extends Presenter> extends BaseFragment<P> {
    protected WEApplication mWeApplication;
    @Override
    protected void ComponentInject() {
        mWeApplication = (WEApplication)mActivity.getApplication();
        setupFragmentComponent(mWeApplication.getAppComponent());
    }

    //提供AppComponent(提供所有的单例对象)给子类，进行Component依赖
    protected abstract void setupFragmentComponent(AppComponent appComponent);

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mWeApplication =null;
    }
}
