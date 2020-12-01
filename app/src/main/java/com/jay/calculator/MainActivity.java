package com.jay.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText fVal, sVal;
    TextView tvAns;
    Button add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fVal = findViewById(R.id.etFirstValue);
        sVal = findViewById(R.id.etSecondValue);

        tvAns = findViewById(R.id.tvAnswer);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);

// Addition
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fValue, sValue;

                fValue = Integer.parseInt(fVal.getText().toString());
                sValue = Integer.parseInt(sVal.getText().toString());

                int ans = fValue + sValue;
                System.out.println(ans + " "+ fValue + " " + sValue);
                tvAns.setText(" Add : " + ans);

            }
        });
// Substraction
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fValue, sValue, ans;

                fValue = Integer.parseInt(fVal.getText().toString());
                sValue = Integer.parseInt(sVal.getText().toString());

                ans = fValue - sValue;

                tvAns.setText(" Sub : " + ans);

            }
        });

// Multiplication

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fValue, sValue, ans;

                fValue = Integer.parseInt(fVal.getText().toString());
                sValue = Integer.parseInt(sVal.getText().toString());

                ans = fValue * sValue;

                tvAns.setText(" Mult : " + ans);

            }
        });

// Division

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int fValue, sValue, ans;

                fValue = Integer.parseInt(fVal.getText().toString());
                sValue = Integer.parseInt(sVal.getText().toString());

                ans = fValue / sValue;

                tvAns.setText(" Divs : "+ ans);

            }
        });




    }
}