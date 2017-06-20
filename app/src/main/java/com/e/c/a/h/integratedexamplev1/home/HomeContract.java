package com.e.c.a.h.integratedexamplev1.home;

import com.e.c.a.h.integratedexamplev1.BasePresenter;
import com.e.c.a.h.integratedexamplev1.BaseView;
import com.e.c.a.h.integratedexamplev1.data.model.CharacterModel;

/**
 * Created by hugoa on 5/10/2017.
 * This is the specific contract between the view
 * and the presenter.
 */

public interface HomeContract {
    interface View extends BaseView<Presenter> {
        void showResults(CharacterModel results);
        void showError(int errorID);
    }

    interface Presenter extends BasePresenter {
        void searchCharacter(String character);
    }
}
