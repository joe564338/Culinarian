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
    //bools used to determine whether or not to clear the text box depending if they have touched
    //the box at least once or not
    boolean touchedPass = false;
    boolean touchedUser = false;
    String password;
    String user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        init();
    }
    //initializes listeners
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
                if (!touchedUser) {
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
                //userLogin();
            }
        });

    }
    //method to connect to login server
    public void userLogin()
    {
        user = userField.getText().toString();
        password = passwordField.getText().toString();
        String method = "login";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method, user, password);
    }
}
