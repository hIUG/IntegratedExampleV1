package com.e.c.a.h.integratedexamplev1.data.source;

import android.support.annotation.NonNull;

import com.e.c.a.h.integratedexamplev1.data.model.CharacterModel;

import javax.inject.Inject;

/**
 * Created by hugoa on 5/10/2017.
 *
 * Synchronizes between locally persisted data and
 * data comming from a Web Service (Marvel's API)
 * Whenever the data requested is not present in the
 * local source is going to fetch the data from the web
 */

public class MarvelRepository implements MarvelDataSource {
    private final MarvelDataSource remoteDataSource;
    private final MarvelDataSource localDataSource;

    @Inject
    public MarvelRepository(@Remote MarvelDataSource remoteDataSource,
                            @Local MarvelDataSource localDataSource) {
        this.remoteDataSource = remoteDataSource;
        this.localDataSource = localDataSource;
    }

    @Override
    public void getCharacter(@NonNull String character, @NonNull GetCharacterCallback callback) {
        remoteDataSource.getCharacter(character, callback);
    }

    @Override
    public void saveCharacter(@NonNull CharacterModel character) {

    }

    @Override
    public void deleteAllCharacters() {

    }
    // TODO - Allexis - 20170510 - Implement logic
}
