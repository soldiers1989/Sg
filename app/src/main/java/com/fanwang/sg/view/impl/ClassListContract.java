package com.fanwang.sg.view.impl;

import com.fanwang.sg.base.BasePresenter;
import com.fanwang.sg.base.IBaseListView;

/**
 * 作者：yc on 2018/9/1.
 * 邮箱：501807647@qq.com
 * 版本：v1.0
 */

public interface ClassListContract {

    interface View extends IBaseListView{

    }

    abstract class Presenter extends BasePresenter<View>{

        public abstract void onRequest(int pagerNumber, String id);

    }

}
