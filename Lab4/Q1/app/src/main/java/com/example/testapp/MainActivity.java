package com.example.testapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button normalButton;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        normalButton = findViewById(R.id.normalButton);
        toggleButton = findViewById(R.id.toggleButton);

        // Normal Button Click
        normalButton.setOnClickListener(v ->
                showCustomToast("Normal Button Clicked!", R.drawable.button_img)
        );

        // Toggle Button Click
        toggleButton.setOnClickListener(v -> {
            if (toggleButton.isChecked()) {
                showCustomToast("Toggle is ON", R.drawable.toggle_img);
            } else {
                showCustomToast("Toggle is OFF", R.drawable.toggle_img);
            }
        });
    }

    // Custom Toast Function
    private void showCustomToast(String message, int imageRes) {

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, null);

        ImageView image = layout.findViewById(R.id.toastImage);
        TextView text = layout.findViewById(R.id.toastText);

        image.setImageResource(imageRes);
        text.setText(message);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}