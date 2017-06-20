package com.e.c.a.h.integratedexamplev1.data.source.remote;

import com.e.c.a.h.integratedexamplev1.data.source.remote.entity.CharacterResult;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by hugoa on 5/12/2017.
 */

public interface MarvelAPI {
    String NAME = "name";
    String API_KEY = "apikey";
    String HASH = "hash";
    String TIMESTAMP = "ts";

    @GET("characters")
    Observable<CharacterResult> getCharacter(
            @Query(NAME) String queryCharacterName,
            @Query(API_KEY) String queryAPIKey,
            @Query(HASH) String hash,
            @Query(TIMESTAMP) long timestamp
    );
}
