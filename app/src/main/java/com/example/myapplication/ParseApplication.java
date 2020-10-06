package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Tj3LyiNzwOGgK0oqUkItIWaJUd8wcmK4Pc8uUqXD")
                .clientKey("tEShyCI3Wf5EIw0MZusCmOslNGaADxUXVDMXr7l5")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
