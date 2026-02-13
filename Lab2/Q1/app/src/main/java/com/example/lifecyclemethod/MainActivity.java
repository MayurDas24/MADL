package com.example.lifecyclemethod;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private void showEvent(String event) {
        Toast.makeText(this, event, Toast.LENGTH_SHORT).show();
        Log.d("LIFECYCLE", event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSecond = findViewById(R.id.btnSecond);
        Button btnClose = findViewById(R.id.btnClose);

        showEvent("onCreate() Called");

        btnSecond.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SecondActivity.class));
        });

        btnClose.setOnClickListener(v -> finish());
    }

    @Override
    protected void onStart() {
        super.onStart();
        showEvent("onStart() Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showEvent("onResume() Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showEvent("onPause() Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showEvent("onStop() Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showEvent("onDestroy() Called");
    }
}