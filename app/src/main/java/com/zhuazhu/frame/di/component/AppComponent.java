package com.zhuazhu.frame.di.component;

import com.zhuazhu.frame.data.HttpHelper;
import com.zhuazhu.frame.di.module.MainModule;
import com.zhuazhu.frame.di.module.NetModule;
import com.zhuazhu.frame.di.module.RecyclerModule;

import javax.inject.Singleton;

import dagger.Component;
import mejust.frame.di.module.AppModule;

/**
 * @author : Beaven
 * @date : 2017-12-20 11:41
 */
@Singleton
@Component(modules = {NetModule.class, AppModule.class})
public interface AppComponent {

    HttpHelper getHttpHelper();

    MainComponent mainComponent(MainModule mainModule);

    RecyclerComponent recyclerComponent(RecyclerModule module);
}
