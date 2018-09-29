package com.example.louayeldin.purificationdemov2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CardView find_btn,partners_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        find_btn = (CardView)findViewById(R.id.find_btn);
        partners_btn = (CardView)findViewById(R.id.partners_btn);
        find_btn.setOnClickListener(this);
        partners_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.find_btn:
                Intent intent = new Intent(MainActivity.this, MapFinder.class);
                startActivity(intent);
                break;

            case R.id.partners_btn:
                Intent intent2 = new Intent(MainActivity.this, OurPartners.class);
                startActivity(intent2);
                break;
        }

    }
}
