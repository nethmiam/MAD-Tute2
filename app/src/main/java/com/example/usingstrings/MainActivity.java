package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView2;
    String TAG = "LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);

        Log.i(TAG, "onCreate() Invoked");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() Invoked");
    }
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG, "onPostResume() Invoked ");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() Invoked ");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart() Invoked ");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() Invoked ");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() Invoked ");
    }
}