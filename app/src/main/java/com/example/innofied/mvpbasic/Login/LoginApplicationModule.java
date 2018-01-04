package com.example.innofied.mvpbasic.Login;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by innofied on 4/1/18.
 */
@Module
public class LoginApplicationModule {

    private Activity activity;

    public LoginApplicationModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    Context getApplicationContext() {
        return activity.getApplicationContext();
    }

    @Provides
    ValidationClass getValidationClass() {
        return new ValidationClass(getApplicationContext());
    }


}
