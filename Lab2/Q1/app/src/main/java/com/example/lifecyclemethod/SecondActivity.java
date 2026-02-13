package com.example.lifecyclemethod;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private void show(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        Log.d("LIFECYCLE", msg);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        show("Second Activity -> onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        show("Second Activity -> onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        show("Second Activity -> onResume()");
    }
}