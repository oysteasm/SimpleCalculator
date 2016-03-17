package com.smith.oystein.simplecalculator;

/**
 * Created by Øystein on 16.03.2016.
 */

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
        number1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberClicked("1", valueTextField);
            }
        });

        Button number2Btn = (Button) findViewById(R.id.number2Btn);
        number2Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                numberClicked("2", valueTextField);
            }
        });

        Button number3Btn = (Button) findViewById(R.id.number3Btn);
        number3Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                numberClicked("3", valueTextField);
            }
        });

        Button number4Btn = (Button) findViewById(R.id.number4Btn);
        number4Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                numberClicked("4", valueTextField);
            }
        });

        Button number5Btn = (Button) findViewById(R.id.number5Btn);
        number5Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                numberClicked("5", valueTextField);
            }
        });

        Button number6Btn = (Button) findViewById(R.id.number6Btn);
        number6Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                numberClicked("6", valueTextField);
            }
        });

        Button number7Btn = (Button) findViewById(R.id.number7Btn);
        number7Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                numberClicked("7", valueTextField);
            }
        });

        Button number8Btn = (Button) findViewById(R.id.number8Btn);
        number8Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                numberClicked("8", valueTextField);
            }
        });

        Button number9Btn = (Button) findViewById(R.id.number9Btn);
        number9Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                numberClicked("9", valueTextField);
            }
        });

        Button number0Btn = (Button) findViewById(R.id.number0Btn);
        number0Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                numberClicked("0", valueTextField);
            }
        });

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                operatorClicked("+", valueTextField);
            }
        });

        Button divBtn = (Button) findViewById(R.id.divBtn);
        divBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                operatorClicked("/", valueTextField);
            }
        });

        Button multBtn = (Button) findViewById(R.id.multBtn);
        multBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                operatorClicked("x", valueTextField);
            }
        });

        Button minBtn = (Button) findViewById(R.id.minBtn);
        minBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                operatorClicked("-", valueTextField);
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

        Button backBtn = (Button) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String currentVal = valueTextField.getText().toString();
                currentVal = currentVal.substring(0, currentVal.length()-1);
                if(currentVal.length()==0){
                    //if no value is displayed. Set to zero
                    currentVal="0";
                }
                valueTextField.setText(currentVal);
            }
        });

        Button CBtn = (Button) findViewById(R.id.CBtn);
        CBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                calculator.Calculator();
                valueTextField.setText("0");
            }
        });

        Button commaBtn = (Button) findViewById(R.id.commaBtn);
        commaBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String currentVal = valueTextField.getText().toString();
                if(currentVal.indexOf(".")==-1) {
                    //If there already is a comma in the number
                    currentVal +=".";
                }
                valueTextField.setText(currentVal);
            }
        });
    }

    private void numberClicked(String num, EditText valTxt){
        String currentVal = valTxt.getText().toString();
        if((currentVal.equals("0")||currentVal.equals("0.0")) && currentVal.indexOf(".")==-1 && !currentVal.equals("-")){
            //if the value is zero and no comma exists, and it is not a minus
            currentVal = num;
        } else {
            currentVal += num;
        }
        valTxt.setText(currentVal);
    }

    private void operatorClicked(String oprtr, EditText valTxt){
        String currentVal = valTxt.getText().toString();
        if(oprtr=="-" && currentVal.equals("0")){
            valTxt.setText("-");
        }else {
            calculator.setNumber1(Float.parseFloat(currentVal));
            calculator.setOperator(oprtr);
            valTxt.setText("0");
        }
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
