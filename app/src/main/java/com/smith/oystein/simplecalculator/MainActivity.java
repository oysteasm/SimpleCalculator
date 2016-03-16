package com.smith.oystein.simplecalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Calculator calculator = new Calculator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText valueTextField = (EditText) findViewById(R.id.numberField);
        Button number1Btn = (Button) findViewById(R.id.number1Btn);
        number1Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float currentVal = Float.parseFloat(valueTextField.getText().toString());
                currentVal *= 10;
                currentVal +=1;
                valueTextField.setText(Float.toString(currentVal));
            }
        });

        Button number2Btn = (Button) findViewById(R.id.number2Btn);
        number2Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float currentVal = Float.parseFloat(valueTextField.getText().toString());
                currentVal *= 10;
                currentVal +=2;
                valueTextField.setText(Float.toString(currentVal));
            }
        });


        Button number3Btn = (Button) findViewById(R.id.number3Btn);
        number3Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float currentVal = Float.parseFloat(valueTextField.getText().toString());
                currentVal *= 10;
                currentVal +=3;
                valueTextField.setText(Float.toString(currentVal));
            }
        });

        Button number4Btn = (Button) findViewById(R.id.number4Btn);
        number4Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float currentVal = Float.parseFloat(valueTextField.getText().toString());
                currentVal *= 10;
                currentVal +=4;
                valueTextField.setText(Float.toString(currentVal));
            }
        });

        Button number5Btn = (Button) findViewById(R.id.number5Btn);
        number5Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float currentVal = Float.parseFloat(valueTextField.getText().toString());
                currentVal *= 10;
                currentVal +=5;
                valueTextField.setText(Float.toString(currentVal));
            }
        });

        Button number6Btn = (Button) findViewById(R.id.number6Btn);
        number6Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float currentVal = Float.parseFloat(valueTextField.getText().toString());
                currentVal *= 10;
                currentVal +=6;
                valueTextField.setText(Float.toString(currentVal));
            }
        });

        Button number7Btn = (Button) findViewById(R.id.number7Btn);
        number7Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float currentVal = Float.parseFloat(valueTextField.getText().toString());
                currentVal *= 10;
                currentVal +=7;
                valueTextField.setText(Float.toString(currentVal));
            }
        });

        Button number8Btn = (Button) findViewById(R.id.number8Btn);
        number8Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float currentVal = Float.parseFloat(valueTextField.getText().toString());
                currentVal *= 10;
                currentVal +=8;
                valueTextField.setText(Float.toString(currentVal));
            }
        });

        Button number9Btn = (Button) findViewById(R.id.number9Btn);
        number9Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float currentVal = Float.parseFloat(valueTextField.getText().toString());
                currentVal *= 10;
                currentVal +=9;
                valueTextField.setText(Float.toString(currentVal));
            }
        });

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float currentVal = Float.parseFloat(valueTextField.getText().toString());
                calculator.setNumber1(currentVal);
                calculator.setOperator("+");
                currentVal = 0;
                valueTextField.setText(Float.toString(currentVal));
            }
        });

        Button equalBtn = (Button) findViewById(R.id.equalBtn);
        equalBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float currentVal = Float.parseFloat(valueTextField.getText().toString());
                calculator.setNumber2(currentVal);
                calculator.calculate();
                valueTextField.setText(Float.toString(calculator.getSum()));
                //Log.d(Float.toString(calculator.getSum()), "sum");
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
