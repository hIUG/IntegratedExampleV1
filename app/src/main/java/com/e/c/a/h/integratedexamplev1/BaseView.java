package com.e.c.a.h.integratedexamplev1;

/**
 * Created by hugoa on 5/10/2017.
 * The BaseView defines the abstract
 * methods that every View in the app
 * should implement.
 */

public interface BaseView<T> {
    void setPresenter(T presenter);
}
