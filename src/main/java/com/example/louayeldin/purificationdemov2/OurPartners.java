package com.example.louayeldin.purificationdemov2;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OurPartners extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_partners);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
