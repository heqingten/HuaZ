package com.tendy.mvparms.huaz.mvp.ui.adapter;

import android.view.View;

import com.jess.arms.base.BaseHolder;
import com.jess.arms.base.DefaultAdapter;
import com.tendy.mvparms.huaz.mvp.model.entity.User;
import com.tendy.mvparms.huaz.mvp.ui.holder.UserItemHolder;

import java.util.List;

import me.jessyan.mvparms.demo.R;

/**
 * Created by jess on 9/4/16 12:57
 * Contact with jess.yan.effort@gmail.com
 */
public class UserAdapter extends DefaultAdapter<User> {
    public UserAdapter(List<User> infos) {
        super(infos);
    }

    @Override
    public BaseHolder<User> getHolder(View v) {
        return new UserItemHolder(v);
    }

    @Override
    public int getLayoutId() {
        return R.layout.recycle_list;
    }
}
