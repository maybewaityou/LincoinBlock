package com.llbt.meepwn.lincolnblock.framework.base;

import android.content.Context;
import android.databinding.ObservableField;

import com.llbt.meepwn.lincolnblock.framework.types.ModelType;
import com.llbt.meepwn.lincolnblock.framework.types.ServiceType;
import com.llbt.meepwn.lincolnblock.framework.types.ViewModelType;
import com.llbt.meepwn.lincolnblock.framework.application.LincolnApplication;

/**
 * package: com.llbt.meepwn.lincolnblock.framework
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 16/4/12 上午11:34
 * desc: 处理业务逻辑
 */
public class ViewModel<M extends ModelType, S extends ServiceType> implements ViewModelType {

    protected ObservableField<M> model;
    protected S service;

    public ViewModel(Context context) {
        LincolnApplication.getRefWatcher(context).watch(this);
    }

    public ViewModel(S service) {
        this.service = service;
        LincolnApplication.getRefWatcher(service.getContext()).watch(this);
    }

    public ViewModel(S service, ObservableField<M> model) {
        this.service = service;
        this.model = model;
        LincolnApplication.getRefWatcher(service.getContext()).watch(this);
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    public ObservableField<M> getModel() {
        return model;
    }

}
