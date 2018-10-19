package com.example.tmaya.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextFirstNumber,editTextSecondNumber;
    Button buttonAdd,buttonSub;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstNumber=findViewById(R.id.firstnumber);
        editTextSecondNumber=findViewById(R.id.secondNumber);
        buttonAdd=findViewById(R.id.buttonAdd);
        buttonSub=findViewById(R.id.buttonSubt);
        textViewResult=findViewById(R.id.result);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNum=editTextFirstNumber.getText().toString();
                String secondNum=editTextSecondNumber.getText().toString();
                int sum=Integer.parseInt(firstNum)+Integer.parseInt(secondNum);
                String result=Integer.toString(sum);
                textViewResult.setText("Sum = "+result);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNum=editTextFirstNumber.getText().toString();
                String secondNum=editTextSecondNumber.getText().toString();
                int sum=Integer.parseInt(firstNum)-Integer.parseInt(secondNum);
                String result=Integer.toString(sum);
                textViewResult.setText("Difference= "+result);
            }
        });
    }
}
