package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    private TextView mTextViewUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mTextViewUsername = (TextView) findViewById(R.id.txt_welcome);

        String username =  getIntent().getStringExtra("username");
        String passowrd = getIntent().getStringExtra("password");

        mTextViewUsername.setText("Welcome: "+username);
    }

    public void goodbye(View view) {

        Intent intent =  new Intent(this, MainActivity.class);
        finish();

    }
}
