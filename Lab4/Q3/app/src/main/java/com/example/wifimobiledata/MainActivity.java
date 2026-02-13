package com.example.wifimobiledata;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleMode;
    ImageView modeImage;
    Button changeModeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleMode = findViewById(R.id.toggleMode);
        modeImage = findViewById(R.id.modeImage);
        changeModeBtn = findViewById(R.id.changeModeBtn);

        // Toggle change listener
        toggleMode.setOnCheckedChangeListener((buttonView, isChecked) -> {
            updateMode(isChecked);
        });

        // Change Mode button
        changeModeBtn.setOnClickListener(v -> {
            toggleMode.setChecked(!toggleMode.isChecked());
            updateMode(toggleMode.isChecked());
        });

        // Initial mode setup
        updateMode(toggleMode.isChecked());
    }

    private void updateMode(boolean isWifi) {
        if (isWifi) {
            modeImage.setImageResource(R.drawable.wifi);
            Toast.makeText(this, "Current Mode: Wi-Fi", Toast.LENGTH_SHORT).show();
        } else {
            modeImage.setImageResource(R.drawable.mobile_data);
            Toast.makeText(this, "Current Mode: Mobile Data", Toast.LENGTH_SHORT).show();
        }
    }
}