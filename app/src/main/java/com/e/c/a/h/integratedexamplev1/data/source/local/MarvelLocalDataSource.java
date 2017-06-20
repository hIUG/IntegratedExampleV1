package com.e.c.a.h.integratedexamplev1.data.source.local;

import android.content.Context;
import android.support.annotation.NonNull;

import com.e.c.a.h.integratedexamplev1.data.source.MarvelDataSource;
import com.e.c.a.h.integratedexamplev1.data.model.CharacterModel;

import javax.inject.Inject;

import static dagger.internal.Preconditions.checkNotNull;

/**
 * Created by hugoa on 5/10/2017.
 * Data source comming from local DB
 */

public class MarvelLocalDataSource implements MarvelDataSource {
    private MarvelDBHelper dbHelper;

    @Inject
    public MarvelLocalDataSource(@NonNull Context context) {
        checkNotNull(context);
        this.dbHelper = new MarvelDBHelper(context);
    }

    @Override
    public void getCharacter(@NonNull String character, @NonNull GetCharacterCallback callback) {

    }

    @Override
    public void saveCharacter(@NonNull CharacterModel character) {

    }

    @Override
    public void deleteAllCharacters() {

    }
    //TODO - Allexis - 20170510 - Add logic...
}
