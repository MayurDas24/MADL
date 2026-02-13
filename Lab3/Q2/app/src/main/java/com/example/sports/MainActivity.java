package com.example.sports;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listSports);

        // Sports list
        String[] sports = {
                "Cricket",
                "Football",
                "Basketball",
                "Tennis",
                "Badminton",
                "Hockey",
                "Volleyball"
        };

        // Adapter
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        sports);

        listView.setAdapter(adapter);

        // Click event
        listView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedSport = sports[position];
            Toast.makeText(MainActivity.this,
                    "You selected: " + selectedSport,
                    Toast.LENGTH_SHORT).show();
        });
    }
}