package com.luojilab.componentdemo.application;

import com.luojilab.component.basicres.BaseApplication;
import com.luojilab.component.componentlib.router.ui.UIRouter;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class AppApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        UIRouter.getInstance().registerUI("app");
    }


}
