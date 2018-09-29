package com.example.louayeldin.purificationdemov2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SigninActivity extends AppCompatActivity implements View.OnClickListener{

    Button sigin_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        sigin_btn = (Button)findViewById(R.id.signin_btn);
        sigin_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(SigninActivity.this, MainActivity.class);
        startActivity(intent);

    }
}
