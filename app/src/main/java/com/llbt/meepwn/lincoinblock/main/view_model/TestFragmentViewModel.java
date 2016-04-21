package com.llbt.meepwn.lincoinblock.main.view_model;

import android.databinding.ObservableField;
import android.view.View;

import com.llbt.meepwn.lincoinblock.framework.base.BaseViewModel;
import com.llbt.meepwn.lincoinblock.main.model.TestFragmentModel;
import com.llbt.meepwn.lincoinblock.main.service.TestFragmentService;

/**
 * package: com.llbt.meepwn.lincoinblock.main.view_model
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 16/4/21 上午8:39
 * desc:
 */
public class TestFragmentViewModel extends BaseViewModel<TestFragmentModel, TestFragmentService> {

    public TestFragmentViewModel(TestFragmentService service, ObservableField<TestFragmentModel> model) {
        super(service, model);
    }

    int tag = 0;
    public void handleClick(View view) {
        TestFragmentModel m = new TestFragmentModel();
        m.getName().set("张三 == " + tag++);
        m.getAge().set("age == " + tag);
        model.set(m);
    }
}
