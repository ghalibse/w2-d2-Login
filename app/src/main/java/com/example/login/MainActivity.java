package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivityTAG_" ;
    private EditText usr, pass;
    private Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {


        usr = (EditText) findViewById(R.id.txt_user);
        pass= (EditText) findViewById(R.id.txt_pass);

        Log.d(TAG, "login: " + usr.getText() +" " + pass.getText());

        Intent intent =  new Intent(this, Welcome.class);

        intent.putExtra("username", usr.getText().toString());
        intent.putExtra("password", pass.getText().toString());

        startActivity(intent);
    }

    public void register(View view) {

        Intent intent =  new Intent(this, Form.class);
        startActivity(intent);
    }
}
