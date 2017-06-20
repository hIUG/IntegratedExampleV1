package com.e.c.a.h.integratedexamplev1.data.source;

import android.support.annotation.NonNull;

import com.e.c.a.h.integratedexamplev1.data.model.CharacterModel;

/**
 * Created by hugoa on 5/12/2017.
 */

public interface MarvelDataSource {
    interface GetCharacterCallback {
        void onCharacterLoaded(CharacterModel character);
        void onNoDataAvailable(int errorID);
    }

    void getCharacter(@NonNull String character, @NonNull GetCharacterCallback callback);
    void saveCharacter(@NonNull CharacterModel character);
    void deleteAllCharacters();
}
