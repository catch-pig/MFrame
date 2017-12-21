package com.zhuazhu.frame.mvp;

import android.support.annotation.NonNull;
import com.zhuazhu.frame.data.HttpHelper;
import javax.inject.Inject;
import mejust.frame.mvp.presenter.BasePresenter;

/**
 * 创建时间:2017-12-21 16:39<br/>
 * 创建人: 王培峰<br/>
 * 修改人: 王培峰<br/>
 * 修改时间: 2017-12-21 16:39<br/>
 * 描述:
 */

public class MainPresenter extends BasePresenter<MainContract.View>
        implements MainContract.Presenter {

    private final HttpHelper httpHelper;

    @Inject
    public MainPresenter(@NonNull MainContract.View view, HttpHelper httpHelper) {
        super(view);
        this.httpHelper = httpHelper;
    }
}
