package com.e.c.a.h.integratedexamplev1.home;

import com.e.c.a.h.integratedexamplev1.BasePresenter;
import com.e.c.a.h.integratedexamplev1.BaseView;

import java.util.List;

/**
 * Created by hugoa on 5/10/2017.
 * This is the specific contract between the view
 * and the presenter.
 */

public interface HomeContract {
    interface View extends BaseView<Presenter> {
        void showResults(List<Character> results);
    }

    interface Presenter extends BasePresenter {
        void searchCharacter(String character);
    }
}
