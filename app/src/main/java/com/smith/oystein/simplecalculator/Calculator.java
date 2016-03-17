package com.smith.oystein.simplecalculator;

/**
 * Created by Øystein on 16.03.2016.
 */
public class Calculator {
    private
    float number1;
    float number2;
    String operator;
    float sum;

    public
    void Calculator(){
        number1 = 0;
        number2 = 0;
        operator = "";
        sum = 0;
    }
    void setNumber1(float num1){
        number1 = num1;
    }
    void setNumber2(float num2){
        number2 = num2;
    }
    void setOperator(String oprtr){
        operator = oprtr;
    }

    void calculate(){
        switch (operator){
            case "+":
                sum = number1+number2;
                break;
            case "x":
                sum = number1*number2;
                break;
            case "-":
                sum = number1-number2;
                break;
            case "/":
                sum = number1/number2;
                break;
            default:
                sum = 0;
                break;
        };
    }

    float getSum(){
        return sum;
    }

}
