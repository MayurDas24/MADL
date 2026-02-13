package com.example.openurl;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText urlInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        urlInput = findViewById(R.id.urlInput);
        Button btnOpen = findViewById(R.id.btnOpen);

        btnOpen.setOnClickListener(v -> openWebsite());
    }

    private void openWebsite() {

        String url = urlInput.getText().toString().trim();

        if (url.isEmpty()) {
            Toast.makeText(this, "Enter a URL", Toast.LENGTH_SHORT).show();
            return;
        }

        // If user forgets https:// add automatically
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "https://" + url;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}