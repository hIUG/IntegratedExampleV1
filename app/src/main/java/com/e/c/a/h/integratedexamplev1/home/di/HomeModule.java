package com.e.c.a.h.integratedexamplev1.home.di;

import com.e.c.a.h.integratedexamplev1.home.HomeContract;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hugoa on 5/12/2017.
 */

@Module
public class HomeModule {
    private final HomeContract.View homeView;

    public HomeModule(HomeContract.View homeView) {
        this.homeView = homeView;
    }

    @Provides
    HomeContract.View provideHomeContractView() {
        return homeView;
    }
}
