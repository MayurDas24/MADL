package com.example.foodapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OrderSummaryActivity extends AppCompatActivity {

    TextView orderDetails, totalCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);

        orderDetails = findViewById(R.id.orderDetails);
        totalCost = findViewById(R.id.totalCost);

        String order = getIntent().getStringExtra("order");
        int total = getIntent().getIntExtra("total", 0);

        orderDetails.setText(order);
        totalCost.setText("Total Cost: ₹" + total);
    }
}