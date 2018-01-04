package com.example.innofied.mvpbasic.Login;

import android.content.Context;

/**
 * Created by innofied on 4/1/18.
 */

public class ValidationClass {
    private Context context;
    boolean b=false;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    public ValidationClass(Context context){
        this.context=context;
    }

    public boolean validation(String mail){
        if(mail.matches(emailPattern)){
            b= true;
        }else{
            b=false;
        }
        return b;
    }

}
