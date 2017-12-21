package com.zhuazhu.frame;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import com.zhuazhu.annotation.LayoutId;
import com.zhuazhu.frame.data.MFrameTitleBarOptions;
import com.zhuazhu.frame.di.component.DaggerMainComponent;
import com.zhuazhu.frame.di.module.MainModule;
import com.zhuazhu.frame.mvp.MainContract;
import com.zhuazhu.frame.mvp.MainPresenter;
import mejust.frame.mvp.view.BasePresenterActivity;
import mejust.frame.utils.log.Logger;

@LayoutId(R.layout.activity_main)
public class MainActivity extends BasePresenterActivity<MainPresenter>
        implements MainContract.View, View.OnClickListener {

    @Override
    protected void initData() {
        MFrameTitleBarOptions options = new MFrameTitleBarOptions(this);
        options.setTitleString("正规的标题");
        options.setTextLeft("退出登录");
        options.setTextLeftSize(14);
        options.setTextLeftColor(Color.WHITE);
        options.setLeftTextListener(this);
        setTitleBar(options);
    }

    @Override
    protected void injectComponent() {
        DaggerMainComponent.builder()
                .appComponent(FrameApplication.getAppComponent())
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected void initView() {

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.image:
                intent.setClass(this, ImageActivity.class);
                startActivity(intent);
                break;
            case R.id.mframe_titlebar_text_left:
                Logger.i("点击了左边文字");
                break;
            default:
                break;
        }
    }
}
