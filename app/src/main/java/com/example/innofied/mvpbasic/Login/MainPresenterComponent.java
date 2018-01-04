package com.example.innofied.mvpbasic.Login;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by innofied on 4/1/18.
 */
@Singleton
@Component(modules = LoginApplicationModule.class)
public interface MainPresenterComponent {

    void inject(MainPresenter mainPresenter);
}
