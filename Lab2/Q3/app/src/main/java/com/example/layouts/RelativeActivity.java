package com.example.layouts;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        Button ok = findViewById(R.id.btnOk);
        Button cancel = findViewById(R.id.btnCancel);

        ok.setOnClickListener(v ->
                Toast.makeText(this,"OK clicked",Toast.LENGTH_SHORT).show());

        cancel.setOnClickListener(v -> finish());
    }
}