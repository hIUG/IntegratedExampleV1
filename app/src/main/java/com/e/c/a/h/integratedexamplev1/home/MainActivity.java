package com.e.c.a.h.integratedexamplev1.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.e.c.a.h.integratedexamplev1.MarvelApplication;
import com.e.c.a.h.integratedexamplev1.R;
import com.e.c.a.h.integratedexamplev1.data.model.CharacterModel;
import com.e.c.a.h.integratedexamplev1.home.di.DaggerHomeComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements HomeContract.View {
    public static final String LOG_TAG = "HACE";

    @Inject
    public HomePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerHomeComponent.builder()
                .marvelRepositoryComponent(((MarvelApplication) getApplication()).getMarvelRepositoryComponent())
                .build();

        //NdefRead
    }

    public void doSearch() {
        presenter.searchCharacter("Thor");
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
//        this.presenter = (HomePresenter) presenter;
    }

    @Override
    public void showResults(CharacterModel result) {
        //TODO - Allexis - 20170510 - Display results in RecyclerView
        Toast.makeText(this, result.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(int errorID) {
        Toast.makeText(this, "Execution error:" + errorID, Toast.LENGTH_SHORT).show();
    }
}
