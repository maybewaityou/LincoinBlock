package com.llbt.meepwn.lincoinblock.framework.base;

import android.app.Activity;
import android.content.Context;

import com.llbt.meepwn.lincoinblock.framework.DataModel;
import com.llbt.meepwn.lincoinblock.framework.PermissionRequest;
import com.llbt.meepwn.lincoinblock.framework.Service;
import com.llbt.meepwn.lincoinblock.utils.network.Just;
import com.tbruyelle.rxpermissions.Permission;
import com.tbruyelle.rxpermissions.RxPermissions;

import java.lang.ref.WeakReference;
import java.util.Map;

import rx.Observable;

/**
 * package: com.llbt.meepwn.lincoinblock.framework.base
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 16/4/12 下午12:46
 * desc: 进行页面间跳转 && 发送网络请求
 */
public abstract class BaseService<DM extends DataModel> implements Service<DM>, PermissionRequest {

    protected WeakReference<Context> context;

    public BaseService(Context context) {
        this.context = new WeakReference<>(context);
    }

    @Override
    public Context getContext() {
        return context.get();
    }

    @Override
    public Observable sendRequest(String url, Map<String, String> params, Class clazz) {
        return Just.sendRequest(context.get(), url, params, clazz);
    }

    @Override
    public Observable<Boolean> requestPermission(String permission) {
        return RxPermissions.getInstance(context.get())
                .request(permission);
    }

    @Override
    public Observable<Permission> requestMutablePermission(String... permission) {
        return RxPermissions.getInstance(context.get())
                .requestEach(permission);
    }

    @Override
    public void popActivity() {
        ((Activity)context.get()).finish();
    }

}
