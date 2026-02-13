package com.example.layoutoperations;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button list = findViewById(R.id.btnListView);
        Button grid = findViewById(R.id.btnGridView);
        Button tab = findViewById(R.id.btnTabLayout);
        Button table = findViewById(R.id.btnTableLayout);

        list.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ListViewActivity.class)));

        grid.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, GridViewActivity.class)));

        tab.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, TabLayoutActivity.class)));

        table.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, TableLayoutActivity.class)));
    }
}