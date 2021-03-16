package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Register parse model(s)
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LVxCnL7oEKvzmWWdPUHjWCPqVuzqGlZs8lIGD5qz")
                .clientKey("MqStmhKiYCTqC0psKYSTZLGzupmwNgkOudvpP0jF")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
