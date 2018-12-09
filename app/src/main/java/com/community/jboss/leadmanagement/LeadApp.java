package com.community.jboss.leadmanagement;

import android.app.Application;
import shortbread.Shortbread;
import timber.log.Timber;

public class LeadApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
         Shortbread.create(this);
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
