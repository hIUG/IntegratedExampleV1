package com.e.c.a.h.integratedexamplev1.data.source;

import com.e.c.a.h.integratedexamplev1.ApplicationModule;
import com.e.c.a.h.integratedexamplev1.data.source.di.MarvelRepositoryModule;
import com.e.c.a.h.integratedexamplev1.data.source.remote.MarvelAPIModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by hugoa on 5/12/2017.
 */

@Singleton
@Component(modules = {MarvelRepositoryModule.class, ApplicationModule.class, MarvelAPIModule.class})
public interface MarvelRepositoryComponent {
    MarvelRepository getRepository();
}
