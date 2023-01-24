package com.stackvectorcalculator;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        PostixFileReader reader = new PostixFileReader("datos.txt");
        final ArrayList<String> expressions = reader.readExpressions();
        System.out.println(expressions.size());
    }
}
