package com.stackvectorcalculator;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        PostixFileReader reader = new PostixFileReader("datos.txt");
        final ArrayList<String> expressions = reader.readExpressions();
        Calculadora calc = new Calculadora();

        for (int i = 0; i < expressions.size(); i++) {
            System.out.print("Result " + (i + 1) + " = ");
            System.out.println(calc.evaluate(expressions.get(i)));
        }
    }
}
