package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        findViewById(R.id.btnAdd).setOnClickListener(v -> calculate("+"));
        findViewById(R.id.btnSub).setOnClickListener(v -> calculate("-"));
        findViewById(R.id.btnMul).setOnClickListener(v -> calculate("*"));
        findViewById(R.id.btnDiv).setOnClickListener(v -> calculate("/"));
    }

    private void calculate(String op) {

        if (num1.getText().toString().isEmpty()
                || num2.getText().toString().isEmpty()) {
            Snackbar.make(num1, "Enter both numbers", Snackbar.LENGTH_SHORT).show();
            return;
        }

        double n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());
        double result = 0;

        if (op.equals("+")) result = n1 + n2;
        else if (op.equals("-")) result = n1 - n2;
        else if (op.equals("*")) result = n1 * n2;
        else if (op.equals("/")) {
            if (n2 == 0) {
                Snackbar.make(num1,"Cannot divide by zero",Snackbar.LENGTH_LONG).show();
                return;
            }
            result = n1 / n2;
        }

        String finalResult = String.format("%.2f %s %.2f = %.2f", n1, op, n2, result);

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("RESULT", finalResult);
        startActivity(intent);
    }
}