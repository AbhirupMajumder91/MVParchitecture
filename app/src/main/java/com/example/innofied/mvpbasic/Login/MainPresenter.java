package com.example.innofied.mvpbasic.Login;

import javax.inject.Inject;

/**
 * Created by innofied on 4/1/18.
 */

public class MainPresenter extends PresenterStub {

    @Inject
    ValidationClass validationClass;

    private IMainView activityCallBack;

    public MainPresenter(IMainView activityCallBack) {
        this.activityCallBack = activityCallBack;

    }


    public void validate(String s) {
        boolean b = true;


        if (!validationClass.validation(s)) {
            b = false;
        }

        activityCallBack.validate(b);

    }

    public interface IMainView {

        void validate(boolean validation);
    }
}
