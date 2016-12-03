package com.hpw.myapp.ui.tv.contract;

import com.hpw.mvpframe.base.CoreBaseModel;
import com.hpw.mvpframe.base.CoreBasePresenter;
import com.hpw.mvpframe.base.CoreBaseView;
import com.hpw.myapp.ui.tv.model.OtherBean;
import com.hpw.myapp.ui.tv.model.TabBean;

import java.util.List;

import rx.Observable;

/**
 * Created by hpw on 16/12/2.
 */

public interface TvContract {
    //主页接口
    abstract class TvMainPresenter extends CoreBasePresenter<TvContract.TvMainModel, TvContract.TvMainView> {
        public abstract void getTabList();
    }

    interface TvMainModel extends CoreBaseModel {
        Observable<List<TabBean>> getTabList();
    }

    interface TvMainView extends CoreBaseView {
        void showTabList(List<TabBean> mTabs);
    }

    //Other接口
    abstract class OtherPresenter extends CoreBasePresenter<TvContract.OtherModel, TvContract.OtherView> {
        public abstract void getOtherData(String url);
    }

    interface OtherModel extends CoreBaseModel {
        Observable<OtherBean> getOtherData(String url);
    }

    interface OtherView extends CoreBaseView {
        void showContent(OtherBean info);
    }

    //TvShow接口
    abstract class TvShowPresenter extends CoreBasePresenter<TvContract.TvShowModel, TvContract.TvShowView> {
        public abstract void onTvShow(String url);
    }

    interface TvShowModel extends CoreBaseModel {
        Observable<OtherBean> onTvShow(String url);
    }

    interface TvShowView extends CoreBaseView {
        void showContent(OtherBean info);

        void onConnecting();

        void onReConnecting();

        void onConnectSucces();

        void onConnectFailed();

        void onPlayComleted();

        void onPlayerStart();

        void onPlayePause();
    }
}