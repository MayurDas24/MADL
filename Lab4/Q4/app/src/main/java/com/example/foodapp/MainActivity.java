package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox pizza, burger, sandwich, coffee;
    Button submitBtn;

    int total = 0;
    StringBuilder orderList = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizza = findViewById(R.id.pizza);
        burger = findViewById(R.id.burger);
        sandwich = findViewById(R.id.sandwich);
        coffee = findViewById(R.id.coffee);
        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(v -> {

            total = 0;
            orderList.setLength(0);

            if (pizza.isChecked()) {
                orderList.append("Pizza - ₹200\n");
                total += 200;
            }

            if (burger.isChecked()) {
                orderList.append("Burger - ₹120\n");
                total += 120;
            }

            if (sandwich.isChecked()) {
                orderList.append("Sandwich - ₹80\n");
                total += 80;
            }

            if (coffee.isChecked()) {
                orderList.append("Coffee - ₹60\n");
                total += 60;
            }

            // Disable editing after submit
            pizza.setEnabled(false);
            burger.setEnabled(false);
            sandwich.setEnabled(false);
            coffee.setEnabled(false);

            // Open next activity
            Intent intent = new Intent(MainActivity.this, OrderSummaryActivity.class);
            intent.putExtra("order", orderList.toString());
            intent.putExtra("total", total);
            startActivity(intent);
        });
    }
}