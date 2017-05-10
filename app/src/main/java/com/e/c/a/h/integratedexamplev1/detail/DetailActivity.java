package com.e.c.a.h.integratedexamplev1.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.e.c.a.h.integratedexamplev1.R;

public class DetailActivity extends AppCompatActivity implements DetailContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    @Override
    public void setPresenter(Object presenter) {

    }
}
