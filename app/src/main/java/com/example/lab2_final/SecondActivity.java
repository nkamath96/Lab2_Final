package com.example.lab2_final;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    public final static String TAG = "SecondActivity";
    private String userName = "";

    TextView userText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"On Create");
        userName = getIntent().getStringExtra("name");
        // set the UI layout for this activity
        setContentView(R.layout.activity_second);

        // initialize UI elements
        userText = findViewById(R.id.tv_user);
        //Set username sent from the main activity
        userText.setText(userName);

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

    //Once logout button is clicked, redirect it back to the MainActivity
    public void logout(View view){
        Intent intent2= new Intent(this, MainActivity.class);
        startActivity(intent2);
    }


}
