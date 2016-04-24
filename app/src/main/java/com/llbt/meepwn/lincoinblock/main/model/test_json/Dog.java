package com.llbt.meepwn.lincoinblock.main.model.test_json;

import android.databinding.ObservableField;

import com.llbt.meepwn.lincoinblock.framework.base.BaseModel;

/**
 * package: com.llbt.meepwn.lincoinblock.main.model
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 16/4/22 下午4:16
 * desc:
 */
public class Dog extends BaseModel {

    private ObservableField<String> mDogName = new ObservableField<>();
    private ObservableField<String> mAge = new ObservableField<>();

    public ObservableField<String> getmDogName() {
        return mDogName;
    }

    public void setmDogName(ObservableField<String> mDogName) {
        this.mDogName = mDogName;
    }

    public ObservableField<String> getmAge() {
        return mAge;
    }

    public void setmAge(ObservableField<String> mAge) {
        this.mAge = mAge;
    }

    @Override
    public String toString() {
        return "{" +
                "\"mDogName\" : " + "\"" + mDogName.get() + "\"" +
                ", \"mAge\" : " + "\"" + mAge.get() + "\"" +
                "}";
    }
}
