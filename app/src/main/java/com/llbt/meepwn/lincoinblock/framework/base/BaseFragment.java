package com.llbt.meepwn.lincoinblock.framework.base;

import android.databinding.ObservableField;
import android.support.v4.app.Fragment;

import com.llbt.meepwn.lincoinblock.framework.Model;
import com.llbt.meepwn.lincoinblock.framework.Service;
import com.llbt.meepwn.lincoinblock.framework.ViewModel;
import com.llbt.meepwn.lincoinblock.framework.application.LincolnApplication;

/**
 * package: com.llbt.meepwn.lincoinblock.framework.base
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 16/4/21 上午6:50
 * desc:
 */
public class BaseFragment<M extends Model, VM extends ViewModel, S extends Service> extends Fragment {

    protected ObservableField<M> model;
    protected VM viewModel;
    protected S service;

    @Override
    public void onDestroy() {
        super.onDestroy();
        LincolnApplication.getRefWatcher(getActivity()).watch(this);
    }
}
