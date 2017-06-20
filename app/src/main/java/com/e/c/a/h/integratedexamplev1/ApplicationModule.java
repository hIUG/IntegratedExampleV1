package com.e.c.a.h.integratedexamplev1;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hugoa on 5/12/2017.
 */

@Module
public final class ApplicationModule {
    private final Context context;

    public ApplicationModule(Context context) {
        this.context = context;
    }

    @Provides
    Context provideContext() {
        return context;
    }
}
