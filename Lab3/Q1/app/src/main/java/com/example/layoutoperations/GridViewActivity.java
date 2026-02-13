package com.example.layoutoperations;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class GridViewActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        GridView grid = findViewById(R.id.gridView);

        String[] data = new String[20];
        for(int i=0;i<20;i++) data[i] = "Item " + (i+1);

        grid.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                data));
    }
}