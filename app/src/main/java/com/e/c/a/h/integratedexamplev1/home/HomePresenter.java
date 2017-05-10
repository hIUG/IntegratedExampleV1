package com.e.c.a.h.integratedexamplev1.home;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hugoa on 5/10/2017.
 *
 */

public class HomePresenter implements HomeContract.Presenter {
    private final HomeContract.View view;

    public HomePresenter(HomeContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {

    }

    @Override
    public void searchCharacter(String character) {
        List<Character> results = new ArrayList<>();
        //TODO - Allexis - 20170510 - Search logic
        view.showResults(results);
    }
}
