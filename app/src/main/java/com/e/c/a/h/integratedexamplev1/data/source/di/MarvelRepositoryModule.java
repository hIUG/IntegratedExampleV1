package com.e.c.a.h.integratedexamplev1.data.source.di;

import android.content.Context;

import com.e.c.a.h.integratedexamplev1.data.source.Local;
import com.e.c.a.h.integratedexamplev1.data.source.MarvelDataSource;
import com.e.c.a.h.integratedexamplev1.data.source.Remote;
import com.e.c.a.h.integratedexamplev1.data.source.local.MarvelLocalDataSource;
import com.e.c.a.h.integratedexamplev1.data.source.remote.MarvelRemoteDataSource;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hugoa on 5/12/2017.
 */

@Module
public class MarvelRepositoryModule {
    @Singleton
    @Provides
    @Local
    MarvelDataSource provideLocalDataSource(Context context) {
        return new MarvelLocalDataSource(context);
    }

    @Singleton
    @Provides
    @Remote
    MarvelDataSource provideRemoteDataSource() {
        return new MarvelRemoteDataSource();
    }
}
