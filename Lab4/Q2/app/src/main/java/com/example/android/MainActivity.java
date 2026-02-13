package com.example.android;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button cupcake, kitkat, oreo, pie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cupcake = findViewById(R.id.btnCupcake);
        kitkat = findViewById(R.id.btnKitkat);
        oreo = findViewById(R.id.btnOreo);
        pie = findViewById(R.id.btnPie);

        cupcake.setOnClickListener(v ->
                showCustomToast("Android Cupcake", R.drawable.cupcake));

        kitkat.setOnClickListener(v ->
                showCustomToast("Android KitKat", R.drawable.kitkat));

        oreo.setOnClickListener(v ->
                showCustomToast("Android Oreo", R.drawable.oreo));

        pie.setOnClickListener(v ->
                showCustomToast("Android Pie", R.drawable.pie));
    }

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