package com.e.c.a.h.integratedexamplev1.home.di;

import com.e.c.a.h.integratedexamplev1.data.source.MarvelRepositoryComponent;
import com.e.c.a.h.integratedexamplev1.home.MainActivity;
import com.e.c.a.h.integratedexamplev1.util.ActivityScoped;

import dagger.Component;

/**
 * Created by hugoa on 5/12/2017.
 */

@ActivityScoped
@Component(dependencies = {MarvelRepositoryComponent.class}, modules = {HomeModule.class})
public interface HomeComponent {
    void inject(MainActivity activity);
}
