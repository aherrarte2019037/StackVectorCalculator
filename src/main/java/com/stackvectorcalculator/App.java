package com.stackvectorcalculator;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        PostixFileReader reader = new PostixFileReader("datos.txt");
        final ArrayList<String> expressions = reader.readExpressions();
        System.out.println(expressions.size());

        Calculadora c = new Calculadora();
        System.out.println(c.evaluate(expressions.get(0)));

    }
}
