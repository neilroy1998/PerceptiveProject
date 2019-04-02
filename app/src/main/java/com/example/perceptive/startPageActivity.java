package com.example.perceptive;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class startPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);

        ActionBar ab = getSupportActionBar();
        ab.hide();
    }

    public void login_clk(View v) {
        Intent i = new Intent(startPageActivity.this, loginActivity.class);
        startActivity(i);
    }
}
