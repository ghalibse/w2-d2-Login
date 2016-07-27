package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Form extends AppCompatActivity {

    private static final String TAG ="FormActivityTAG_" ;
    EditText mEditTextUsername, mEditTextPassword, mEditTextEmail, CustomerName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }

    public void submit(View view) {

        CustomerName = (EditText) findViewById(R.id.etxt_name);
        mEditTextUsername = (EditText) findViewById(R.id.etxt_addrs);
        mEditTextPassword = (EditText) findViewById(R.id.etxt_pass);
        mEditTextEmail = (EditText) findViewById(R.id.etxt_conPass);

        Log.d(TAG, "submit : "+ mEditTextUsername.getText() +" "+ mEditTextPassword.getText());

        Intent intent =  new Intent(this, Welcome.class);

        intent.putExtra("username", CustomerName.getText().toString());
        intent.putExtra("password", mEditTextPassword.getText().toString());
        intent.putExtra("email", mEditTextPassword.getText().toString());

        startActivity(intent);

    }
}
