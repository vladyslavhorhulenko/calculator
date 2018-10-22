package com.example.fggh4.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btdot;
    Button btAdd;
    Button btSub;
    Button btMult;
    Button btDiv;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9;
    Button bt0;
    Button btd;
    Button btac;
    TextView tv, tvLog;
    Double arg1, arg2;
    char[] newS;
    char operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tvResult);
        tvLog = findViewById(R.id.tvLog);
        btAdd = findViewById(R.id.btnAdd);
        btSub = findViewById(R.id.btnSub);
        btMult = findViewById(R.id.btnMult);
        btDiv = findViewById(R.id.btnDiv);
        bt1 = findViewById(R.id.btn1);
        bt2 = findViewById(R.id.btn2);
        bt3 = findViewById(R.id.btn3);
        bt4 = findViewById(R.id.btn4);
        bt5 = findViewById(R.id.btn5);
        bt6 = findViewById(R.id.btn6);
        bt7 = findViewById(R.id.btn7);
        bt8 = findViewById(R.id.btn8);
        bt9 = findViewById(R.id.btn9);
        bt0 = findViewById(R.id.btn0);
        btdot = findViewById(R.id.btndot);
        btd = findViewById(R.id.btnd);
        btac = findViewById(R.id.btnac);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt0.setOnClickListener(this);
        btdot.setOnClickListener(this);
        btDiv.setOnClickListener(this);
        btSub.setOnClickListener(this);
        btAdd.setOnClickListener(this);
        btMult.setOnClickListener(this);
        btd.setOnClickListener(this);
        btac.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                if(tvLog.getText() != "") {
                    char[] s1 = tvLog.getText().toString().toCharArray();
                    if (!(s1[s1.length - 2] == '+' || s1[s1.length - 2] == '-' || s1[s1.length - 2] == '*' || s1[s1.length - 2] == '/')) {
                        arg1 = null;
                        tvLog.setText("");
                        tv.setText("");
                        tv.setText(tv.getText() + "1");
                    }
                    else if(tv.getText() != ""){
                        if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                        }
                        else {
                            tv.setText(tv.getText() + "1");
                        }
                    }
                    else
                        tv.setText(tv.getText() + "1");
                }
                else if(tv.getText() != ""){
                    if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                    }
                    else {
                        tv.setText(tv.getText() + "1");
                    }
                }
                else
                    tv.setText(tv.getText() + "1");
                break;
            case R.id.btn2:
                if(tvLog.getText() != "") {
                    char[] s1 = tvLog.getText().toString().toCharArray();
                    if (!(s1[s1.length - 2] == '+' || s1[s1.length - 2] == '-' || s1[s1.length - 2] == '*' || s1[s1.length - 2] == '/')) {
                        arg1 = null;
                        tvLog.setText("");
                        tv.setText("");
                        tv.setText(tv.getText() + "2");
                    }
                    else if(tv.getText() != ""){
                        if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                        }
                        else {
                            tv.setText(tv.getText() + "2");
                        }
                    }
                    else
                        tv.setText(tv.getText() + "2");
                }
                else if(tv.getText() != ""){
                    if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                    }
                    else {
                        tv.setText(tv.getText() + "2");
                    }
                }
                else
                    tv.setText(tv.getText() + "2");
                break;
            case R.id.btn3:
                if(tvLog.getText() != "") {
                    char[] s1 = tvLog.getText().toString().toCharArray();
                    if (!(s1[s1.length - 2] == '+' || s1[s1.length - 2] == '-' || s1[s1.length - 2] == '*' || s1[s1.length - 2] == '/')) {
                        arg1 = null;
                        tvLog.setText("");
                        tv.setText("");
                        tv.setText(tv.getText() + "3");
                    }
                    else if(tv.getText() != ""){
                        if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                        }
                        else {
                            tv.setText(tv.getText() + "3");
                        }
                    }
                    else
                        tv.setText(tv.getText() + "3");
                }
                else if(tv.getText() != ""){
                    if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                    }
                    else {
                        tv.setText(tv.getText() + "3");
                    }
                }
                else
                    tv.setText(tv.getText() + "3");
                break;
            case R.id.btn4:
                if(tvLog.getText() != "") {
                    char[] s1 = tvLog.getText().toString().toCharArray();
                    if (!(s1[s1.length - 2] == '+' || s1[s1.length - 2] == '-' || s1[s1.length - 2] == '*' || s1[s1.length - 2] == '/')) {
                        arg1 = null;
                        tvLog.setText("");
                        tv.setText("");
                        tv.setText(tv.getText() + "4");
                    }
                    else if(tv.getText() != ""){
                        if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                        }
                        else {
                            tv.setText(tv.getText() + "4");
                        }
                    }
                    else
                        tv.setText(tv.getText() + "4");
                }
                else if(tv.getText() != ""){
                    if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){
                    }
                    else {
                        tv.setText(tv.getText() + "4");
                    }
                }
                else
                    tv.setText(tv.getText() + "4");
                break;
            case R.id.btn5:
                if(tvLog.getText() != "") {
                    char[] s1 = tvLog.getText().toString().toCharArray();
                    if (!(s1[s1.length - 2] == '+' || s1[s1.length - 2] == '-' || s1[s1.length - 2] == '*' || s1[s1.length - 2] == '/')) {
                        arg1 = null;
                        tvLog.setText("");
                        tv.setText("");
                        tv.setText(tv.getText() + "5");
                    }
                    else if(tv.getText() != ""){
                        if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                        }
                        else {
                            tv.setText(tv.getText() + "5");
                        }
                    }
                    else
                        tv.setText(tv.getText() + "5");
                }
                else if(tv.getText() != ""){
                    if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                    }
                    else {
                        tv.setText(tv.getText() + "5");
                    }
                }
                else
                    tv.setText(tv.getText() + "5");
                break;
            case R.id.btn6:
                if(tvLog.getText() != "") {
                    char[] s1 = tvLog.getText().toString().toCharArray();
                    if (!(s1[s1.length - 2] == '+' || s1[s1.length - 2] == '-' || s1[s1.length - 2] == '*' || s1[s1.length - 2] == '/')) {
                        arg1 = null;
                        tvLog.setText("");
                        tv.setText("");
                        tv.setText(tv.getText() + "6");
                    }
                    else if(tv.getText() != ""){
                        if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                        }
                        else {
                            tv.setText(tv.getText() + "6");
                        }
                    }
                    else
                        tv.setText(tv.getText() + "6");
                }
                else if(tv.getText() != ""){
                    if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                    }
                    else {
                        tv.setText(tv.getText() + "6");
                    }
                }
                else
                    tv.setText(tv.getText() + "6");
                break;
            case R.id.btn7:
                if(tvLog.getText() != "") {
                    char[] s1 = tvLog.getText().toString().toCharArray();
                    if (!(s1[s1.length - 2] == '+' || s1[s1.length - 2] == '-' || s1[s1.length - 2] == '*' || s1[s1.length - 2] == '/')) {
                        arg1 = null;
                        tvLog.setText("");
                        tv.setText("");
                        tv.setText(tv.getText() + "7");
                    }
                    else if(tv.getText() != ""){
                        if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                        }
                        else {
                            tv.setText(tv.getText() + "7");
                        }
                    }
                    else
                        tv.setText(tv.getText() + "7");
                }
                else if(tv.getText() != ""){
                    if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                    }
                    else {
                        tv.setText(tv.getText() + "7");
                    }
                }
                else
                    tv.setText(tv.getText() + "7");
                break;
            case R.id.btn8:
                if(tvLog.getText() != "") {
                    char[] s1 = tvLog.getText().toString().toCharArray();
                    if (!(s1[s1.length - 2] == '+' || s1[s1.length - 2] == '-' || s1[s1.length - 2] == '*' || s1[s1.length - 2] == '/')) {
                        arg1 = null;
                        tvLog.setText("");
                        tv.setText("");
                        tv.setText(tv.getText() + "8");
                    }
                    else if(tv.getText() != ""){
                        if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                        }
                        else {
                            tv.setText(tv.getText() + "8");
                        }
                    }
                    else
                        tv.setText(tv.getText() + "8");
                }
                else if(tv.getText() != ""){
                    if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                    }
                    else {
                        tv.setText(tv.getText() + "8");
                    }
                }
                else
                    tv.setText(tv.getText() + "8");
                break;
            case R.id.btn9:
                if(tvLog.getText() != "") {
                    char[] s1 = tvLog.getText().toString().toCharArray();
                    if (!(s1[s1.length - 2] == '+' || s1[s1.length - 2] == '-' || s1[s1.length - 2] == '*' || s1[s1.length - 2] == '/')) {
                        arg1 = null;
                        tvLog.setText("");
                        tv.setText("");
                        tv.setText(tv.getText() + "9");
                    }
                    else if(tv.getText() != ""){
                        if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                        }
                        else {
                            tv.setText(tv.getText() + "9");
                        }
                    }
                    else
                        tv.setText(tv.getText() + "9");
                }
                else if(tv.getText() != ""){
                    if(tv.getText().length() == 1 && tv.getText().toString().toCharArray()[0] == '0'){

                    }
                    else {
                        tv.setText(tv.getText() + "9");
                    }
                }
                else
                    tv.setText(tv.getText() + "9");
                break;
            case R.id.btn0:
                if(tvLog.getText() != "") {
                    char[] s1 = tvLog.getText().toString().toCharArray();
                    if (!(s1[s1.length - 2] == '+' || s1[s1.length - 2] == '-' || s1[s1.length - 2] == '*' || s1[s1.length - 2] == '/')) {
                        arg1 = null;
                        tvLog.setText("");
                        tv.setText("");
                        tv.setText(tv.getText() + "0");
                    }
                    else {
                        if (tv.getText() != "") {
                            String s = String.valueOf(tv.getText());
                            if (Double.valueOf(s) != 0 || s.contains(".")) {
                                tv.setText(tv.getText() + "0");
                            }

                        }
                        else {
                            tv.setText("0");
                        }
                    }
                }
                else {
                    if (tv.getText() != "") {
                        String s = String.valueOf(tv.getText());
                        if(Double.valueOf(s) != 0 || s.contains(".")){
                            tv.setText(tv.getText() + "0");
                        }
                    }
                    else {
                        tv.setText("0");
                    }
                }
                break;
            case R.id.btndot:
                if(tv.getText() != ""){
                    String s = String.valueOf(tv.getText());
                    if(!s.contains(".")) {
                        tv.setText(tv.getText() + ".");
                    }
                }
                break;
            case R.id.btnac:
                tv.setText("");
                break;
            case R.id.btnAdd:
                if((tvLog.getText() != "" || tv.getText() != "")) {
                    if(tv.getText() == "") {
                        char[] s = tvLog.getText().toString().toCharArray();
                        if (s[s.length - 2] == '+' || s[s.length - 2] == '-' || s[s.length - 2] == '*' || s[s.length - 2] == '/') {
                            s[s.length - 2] = '+';
                            tvLog.setText(String.valueOf(s));
                            operation = '+';
                        }
                    }
                    else{
                        operation = '+';
                        arg1 = Double.valueOf(tv.getText().toString());
                        tvLog.setText(tv.getText().toString() + " + ");
                        tv.setText("");
                    }
                }
                break;
            case R.id.btnSub:
                if((tvLog.getText() != "" || tv.getText() != "")) {
                    if(tv.getText() == "") {
                        char[] s = tvLog.getText().toString().toCharArray();
                        if (s[s.length - 2] == '+' || s[s.length - 2] == '-' || s[s.length - 2] == '*' || s[s.length - 2] == '/') {
                            s[s.length - 2] = '-';
                            tvLog.setText(String.valueOf(s));
                            operation = '-';
                        }
                    }
                    else{
                        operation = '-';
                        arg1 = Double.valueOf(tv.getText().toString());
                        tvLog.setText(tv.getText().toString() + " - ");
                        tv.setText("");
                    }
                }
                break;
            case R.id.btnMult:
                if((tvLog.getText() != "" || tv.getText() != "")) {
                    if(tv.getText() == "") {
                        char[] s = tvLog.getText().toString().toCharArray();
                        if (s[s.length - 2] == '+' || s[s.length - 2] == '-' || s[s.length - 2] == '*' || s[s.length - 2] == '/') {
                            s[s.length - 2] = '*';
                            tvLog.setText(String.valueOf(s));
                            operation = '*';
                        }
                    }
                    else{
                        operation = '*';
                        arg1 = Double.valueOf(tv.getText().toString());
                        tvLog.setText(tv.getText().toString() + " * ");
                        tv.setText("");
                    }
                }
                break;
            case R.id.btnDiv:
                if((tvLog.getText() != "" || tv.getText() != "")) {
                    if(tv.getText() == "") {
                        char[] s = tvLog.getText().toString().toCharArray();
                        if (s[s.length - 2] == '+' || s[s.length - 2] == '-' || s[s.length - 2] == '*' || s[s.length - 2] == '/') {
                            s[s.length - 2] = '/';
                            tvLog.setText(String.valueOf(s));
                            operation = '/';
                        }
                    }
                    else{
                        operation = '/';
                        arg1 = Double.valueOf(tv.getText().toString());
                        tvLog.setText(tv.getText().toString() + " / ");
                        tv.setText("");
                    }
                }
                break;
            case R.id.btnd:
                if(tv.getText() != ""){
                    arg2 = Double.valueOf(tv.getText().toString());
                }
                if(arg1 != null && arg2!= null) {
                    tvLog.setText(tvLog.getText() + tv.getText().toString() + " = ");
                    double a;
                    int b;
                    switch (operation) {
                        case '+':
                            a = Double.valueOf(Calc.Plus(arg1, arg2));
                            b = (int) a;
                            if(a - b == 0.0) {
                                tvLog.setText(tvLog.getText() + String.valueOf(b));
                                tv.setText(String.valueOf(b));
                            }
                            else {
                                tvLog.setText(tvLog.getText() + String.valueOf(a));
                                tv.setText(String.valueOf(a));
                            }
                            arg1 = a;
                            break;
                        case '-':
                            a = Double.valueOf(Calc.Minus(arg1, arg2));
                            b = (int) a;
                            if(a - b == 0.0) {
                                tvLog.setText(tvLog.getText() + String.valueOf(b));
                                tv.setText(String.valueOf(b));
                            }
                            else {
                                tvLog.setText(tvLog.getText() + String.valueOf(a));
                                tv.setText(String.valueOf(a));
                            }
                            arg1 = a;
                            break;
                        case '*':
                            a = Double.valueOf(Calc.Mult(arg1, arg2));
                            b = (int) a;
                            if(a - b == 0.0) {
                                tvLog.setText(tvLog.getText() + String.valueOf(b));
                                tv.setText(String.valueOf(b));
                            }
                            else {
                                tvLog.setText(tvLog.getText() + String.valueOf(a));
                                tv.setText(String.valueOf(a));
                            }
                            arg1 = a;
                            break;
                        case '/':
                            if(arg2 == 0){
                                tvLog.setText("Ділення на нуль");
                            }
                            else {
                                a = Double.valueOf(Calc.Div(arg1, arg2));
                                b = (int) a;
                                if(a - b == 0.0) {
                                    tvLog.setText(tvLog.getText() + String.valueOf(b));
                                    tv.setText(String.valueOf(b));
                                }
                                else {
                                    tvLog.setText(tvLog.getText() + String.valueOf(a));
                                    tv.setText(String.valueOf(a));
                                }
                                arg1 = a;
                            }
                            break;
                    }
                }

                arg2 = null;
                break;
        }
    }
}
