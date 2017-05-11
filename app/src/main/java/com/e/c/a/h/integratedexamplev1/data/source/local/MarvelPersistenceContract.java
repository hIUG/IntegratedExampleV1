package com.e.c.a.h.integratedexamplev1.data.source.local;

import android.provider.BaseColumns;

/**
 * Created by hugoa on 5/10/2017.
 */

public final class MarvelPersistenceContract {
    private MarvelPersistenceContract() {}

    public static abstract class CharacterEntry implements BaseColumns {
        //TODO - Implement remaining fields
        public static final String TABLE_NAME = "character";
    }
}
