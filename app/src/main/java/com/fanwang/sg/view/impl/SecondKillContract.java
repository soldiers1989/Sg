package com.fanwang.sg.view.impl;

import com.fanwang.sg.base.BasePresenter;
import com.fanwang.sg.base.IBaseView;
import com.fanwang.sg.bean.DataBean;

import java.util.List;

/**
 * 作者：yc on 2018/8/30.
 * 邮箱：501807647@qq.com
 * 版本：v1.0
 */

public interface SecondKillContract {

    interface View extends IBaseView{

        void onGetLabel(List<DataBean> listBean);
    }

    abstract class Presenter extends BasePresenter<View>{

        public abstract void onLabel();
    }

}
