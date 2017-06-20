package com.e.c.a.h.integratedexamplev1.home;

import com.e.c.a.h.integratedexamplev1.data.model.CharacterModel;
import com.e.c.a.h.integratedexamplev1.data.source.MarvelDataSource;
import com.e.c.a.h.integratedexamplev1.data.source.MarvelRepository;

import javax.inject.Inject;

/**
 * Created by hugoa on 5/10/2017.
 *
 */

public class HomePresenter implements HomeContract.Presenter {
    private final HomeContract.View view;
    private final MarvelRepository repository;

    @Inject
    public HomePresenter(MarvelRepository repository, HomeContract.View view) {
        this.repository = repository;
        this.view = view;
    }

    @Inject
    void setupListeners() {
        view.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void searchCharacter(String character) {
        repository.getCharacter(character, new MarvelDataSource.GetCharacterCallback() {
            @Override
            public void onCharacterLoaded(CharacterModel character) {
                view.showResults(character);
            }

            @Override
            public void onNoDataAvailable(int errorID) {
                view.showError(errorID);
            }
        });
    }
}
