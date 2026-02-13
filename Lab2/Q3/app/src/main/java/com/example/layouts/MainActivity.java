package com.example.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"LinearLayout Demo",Toast.LENGTH_SHORT).show();

        // Tap anywhere to open relative layout
        findViewById(android.R.id.content).setOnClickListener(v ->
                startActivity(new Intent(this, RelativeActivity.class))
        );
    }
}