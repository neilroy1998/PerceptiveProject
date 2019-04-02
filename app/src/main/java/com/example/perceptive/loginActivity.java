package com.example.perceptive;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar ab = getSupportActionBar();
        ab.hide();
    }

    public void login_bclk (View v) {
        Intent i = new Intent(this, homePageActivity.class);
        startActivity(i);
    }

    public void cancel_bclk(View v) {
        this.finish();
    }
}
