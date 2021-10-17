package com.example.lab2_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String TAG = "MainActivity";
    public final static String USERNAME = "testUser";
    public final static String PASSWORD = "123456";

    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "On Create");

        // set the UI layout for this activity
        setContentView(R.layout.activity_main);

        // initialize UI elements
        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);

    }

    public void login(View view) {

        //Check if the username and password match, if it does direct it to the Welcome page.
        if(username.getText().toString().equals(USERNAME) && password.getText().toString().equals(PASSWORD)){
            Intent intent1= new Intent(this, SecondActivity.class);
            intent1.putExtra("name", USERNAME);
            startActivity(intent1);
        }

        //Display a toast message if the username or password is incorrect
        else{
            Context context = getApplicationContext();
            CharSequence errorMessage = "Incorrect username or password.";
            int duration = Toast.LENGTH_LONG;
            Toast.makeText(context, errorMessage, duration).show();

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "On Pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "On Restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "On Destroy");
    }

}