package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText number1 = findViewById(R.id.number1);
        final EditText number2 = findViewById(R.id.number2);
        final Button equals = findViewById(R.id.equals);
        //final RadioButton add = findViewById(R.id.add);
        final RadioGroup operators = findViewById(R.id.operators);
        final TextView result = findViewById(R.id.result);

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1Value = Integer.parseInt(number1.getText().toString());
                int number2Value = Integer.parseInt(number2.getText().toString());

                int answer;
                if (operators.getCheckedRadioButtonId() == R.id.substract){
                    answer = number1Value - number2Value;
                } else {
                    answer = number1Value + number2Value;
                }

                result.setText(answer + "");
            }
        });
    }
}
