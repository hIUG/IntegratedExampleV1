package com.e.c.a.h.integratedexamplev1.data.source.remote;

import com.e.c.a.h.integratedexamplev1.util.Constants;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by hugoa on 5/12/2017.
 */

@Module
public class MarvelAPIModule {
    @Singleton
    @Provides
    MarvelAPI provideMarvelAPI(Retrofit retrofit) {
        return retrofit.create(MarvelAPI.class);
    }

    @Singleton
    @Provides
    Retrofit provideRetrofit(Converter.Factory converterFactory, CallAdapter.Factory callAdapterFactory) {
        return  new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(converterFactory)
                .addCallAdapterFactory(callAdapterFactory)
                .build();
    }

    @Singleton
    @Provides
    Converter.Factory provideGsonConverterFactory(Gson gson) {
        return GsonConverterFactory.create(gson);
    }

    @Singleton
    @Provides
    Gson providesGson() {
        return new Gson();
    }

    @Singleton
    @Provides
    CallAdapter.Factory providesRxJavaCallAdapterFactory() {
        return RxJavaCallAdapterFactory.create();
    }
}
