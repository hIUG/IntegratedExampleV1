package com.e.c.a.h.integratedexamplev1.data.source.remote;

import android.support.annotation.NonNull;
import android.util.Log;

import com.e.c.a.h.integratedexamplev1.R;
import com.e.c.a.h.integratedexamplev1.data.mapper.Mapper;
import com.e.c.a.h.integratedexamplev1.data.source.MarvelDataSource;
import com.e.c.a.h.integratedexamplev1.data.model.CharacterModel;
import com.e.c.a.h.integratedexamplev1.data.source.remote.entity.CharacterResult;
import com.e.c.a.h.integratedexamplev1.util.Constants;
import com.e.c.a.h.integratedexamplev1.util.HashUtil;
import com.e.c.a.h.integratedexamplev1.util.TimeUtil;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;

import static com.e.c.a.h.integratedexamplev1.home.MainActivity.LOG_TAG;

/**
 * Created by hugoa on 5/10/2017.
 * Data source comming from Marvel API
 */

public class MarvelRemoteDataSource implements MarvelDataSource {

    @Inject
    MarvelAPI marvelAPI;

    public MarvelRemoteDataSource() {
    }

    @Override
    public void getCharacter(@NonNull String character, @NonNull final GetCharacterCallback callback) {
        long ts = TimeUtil.getCurrentTimestamp();
        Observable<CharacterResult> resultObservable = marvelAPI
                .getCharacter(character, Constants.PUBLIC_KEY, HashUtil.getHash(ts), ts);

        resultObservable.subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<CharacterResult>() {
                    @Override
                    public void onCompleted() {
                        Log.d(LOG_TAG, "onCompleted: RETRIEVED CHARACTER");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(LOG_TAG, "onError: ERROR RETREIVING CHARACTER");
                        callback.onNoDataAvailable(R.string.backend_error);

                        /**
                         * if(e instanceof HttpException ... <> 200
                         * IOException ... No network | Server unreachable
                         * */
                    }

                    @Override
                    public void onNext(CharacterResult characterResult) {
                        callback.onCharacterLoaded(Mapper.mapCharacterResponseToCharacterModel(characterResult));
                    }
                });
    }

    @Override
    public void saveCharacter(@NonNull CharacterModel character) {

    }

    @Override
    public void deleteAllCharacters() {

    }
    //TODO - Allexis - 20170510 - Add remote consumption logic...
}
