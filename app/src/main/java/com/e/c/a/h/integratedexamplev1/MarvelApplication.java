package com.e.c.a.h.integratedexamplev1;

import android.app.Application;

import com.e.c.a.h.integratedexamplev1.data.source.DaggerMarvelRepositoryComponent;
import com.e.c.a.h.integratedexamplev1.data.source.MarvelRepositoryComponent;

/**
 * Created by hugoa on 5/10/2017.
 */

public class MarvelApplication extends Application {
    private MarvelRepositoryComponent marvelRepositoryComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        marvelRepositoryComponent = DaggerMarvelRepositoryComponent
                .builder()
                .applicationModule(new ApplicationModule(getApplicationContext()))
                .build();

        //TODO - Allexis - 20170510 - Add Dagger Repository Component
    }

    public MarvelRepositoryComponent getMarvelRepositoryComponent() {
        return marvelRepositoryComponent;
    }
}
