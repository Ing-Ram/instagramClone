package com.codepath.ingram.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cJdu4EIpiZnxPedX5zTvkmSR2NfnxhQ1Ut0u3xjA")
                .clientKey("HCZfODhGt1FS2nbIAEWB7544vwB7Vub6LkL1Chrn")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
