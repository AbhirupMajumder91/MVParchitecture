package com.example.innofied.mvpbasic.Login;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by innofied on 4/1/18.
 */

public abstract class PresentedActivity<T extends Presenter> extends AppCompatActivity {

    private T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        presenter.create();

    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }

    public void inject() {
        presenter = onCreatePresenter();
        MainPresenterComponent component = DaggerMainPresenterComponent.builder()
                .loginApplicationModule(new LoginApplicationModule(PresentedActivity.this)).build();
        injectPresenter(component, presenter);

    }

    public abstract T onCreatePresenter();

    public abstract void injectPresenter(MainPresenterComponent component, T presenter);
}
