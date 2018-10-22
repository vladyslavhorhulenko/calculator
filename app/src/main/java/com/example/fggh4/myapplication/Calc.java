package com.example.fggh4.myapplication;

import android.view.View;
import android.widget.EditText;

public final class Calc {
    public static String Plus(final double a, final double b){
                return String.valueOf(a + b);
    }
    public static String Minus(final double a, final double b){
        return String.valueOf(a - b);
    }
    public static String Mult(final double a, final double b){
        return String.valueOf(a * b);
    }
    public static String Div(final double a, final double b){
        return String.valueOf(a / b);
    }
}
