package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultText = findViewById(R.id.resultText);
        Button btnBack = findViewById(R.id.btnBack);

        resultText.setText(getIntent().getStringExtra("RESULT"));

        btnBack.setOnClickListener(v -> finish());
    }
}