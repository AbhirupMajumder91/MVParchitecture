package com.example.innofied.mvpbasic.Login;

/**
 * Created by innofied on 3/1/18.
 */

public class UserDetails {

    public String fullname;
    public String mailid;
    public String mobile;

    public String getfullname(){
        return fullname;
    }

    public void setFullname(String fullname){
        this.fullname=fullname;
    }
    public String getMailid(){
        return mailid;
    }
    public void setMailid(String mailid){
        this.mailid=mailid;
    }

    public String getmobile(){
        return mobile;
    }

    public void setMobile(String mobile){
        this.mobile=mobile;
    }

}
