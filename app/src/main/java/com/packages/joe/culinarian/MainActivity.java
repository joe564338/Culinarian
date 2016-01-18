package com.packages.joe.culinarian;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity{

    Button loginButton;
    EditText passwordField;
    EditText userField;
    boolean touchedPass = false;
    boolean touchedUser = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        passwordField = (EditText) findViewById(R.id.mPasswordField);
        passwordField.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!touchedPass){
                    passwordField.setText("");
                }
                touchedPass = true;
            }
        });
        userField = (EditText) findViewById(R.id.mUserField);
        userField.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!touchedUser){
                    userField.setText("");
                }
                touchedUser = true;
            }
        });
        loginButton = (Button) findViewById(R.id.mLoginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Logging in...", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}
