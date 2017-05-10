package com.e.c.a.h.integratedexamplev1.detail;

/**
 * Created by hugoa on 5/10/2017.
 */

public class DetailPresenter implements DetailContract.Presenter {
    private final DetailContract.View view;

    public DetailPresenter(DetailContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {

    }
}
