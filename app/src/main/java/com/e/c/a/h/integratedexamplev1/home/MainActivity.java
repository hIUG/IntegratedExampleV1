package com.e.c.a.h.integratedexamplev1.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.e.c.a.h.integratedexamplev1.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements HomeContract.View {

//    @Inject
    private HomePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSearch() {
        presenter.searchCharacter("Thor");
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {

    }

    @Override
    public void showResults(List<Character> results) {
        //TODO - Allexis - 20170510 - Display results in RecyclerView
    }
}
