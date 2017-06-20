package com.e.c.a.h.integratedexamplev1.data.source.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hugoa on 5/10/2017.
 */

public class MarvelDBHelper extends SQLiteOpenHelper {
    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "Marvel.db";

    public static final String TYPE_TEXT = " TEXT ";
    public static final String TYPE_BOOLEAN = " INTEGER ";

    public static final String SEP_COMMA = ",";

    private static final String SQL_CREATE_TABLE_CHARACTERS =
            "CREATE TABLE " + MarvelPersistenceContract.CharacterEntry.TABLE_NAME + "("
                    + MarvelPersistenceContract.CharacterEntry.FIELD_CHARACTER_ID + TYPE_TEXT + SEP_COMMA
                    + MarvelPersistenceContract.CharacterEntry.FIELD_CHARACTER_NAME + TYPE_TEXT + SEP_COMMA
                    + MarvelPersistenceContract.CharacterEntry.FIELD_CHARACTER_DESCRIPTION + TYPE_TEXT + SEP_COMMA
                    + MarvelPersistenceContract.CharacterEntry.FIELD_CHARACTER_THUMBNAIL + TYPE_TEXT + SEP_COMMA
                    + MarvelPersistenceContract.CharacterEntry.FIELD_CHARACTER_IMAGE + TYPE_TEXT + ")";

    public MarvelDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE_CHARACTERS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        throw new UnsupportedOperationException("Not implemented...");
    }
}
