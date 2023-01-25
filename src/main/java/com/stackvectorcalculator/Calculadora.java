package com.stackvectorcalculator;

import java.sql.SQLOutput;

public class Calculadora implements ICalculator{
    StackVector<Double> stack = new StackVector<Double>();

    @Override
    public double evaluate(String expression) throws ArithmeticException {

        for (int i = 0; i < expression.length(); i++) {

            String e = String.valueOf(expression.charAt(i));

            // verifica si es espacio
            if (!e.equals(" ")){
                // reconoce los operadores
                if (e.equals("+")||e.equals("-")||e.equals("*")||e.equals("/")){
                    double operandoB = getPrevious();
                    double operandoA = getPrevious();
                    if (e.equals("+")){
                        stack.push(operandoA + operandoB);
                    }

                }else { // cuando es un operando se realiza push
                    stack.push(Double.parseDouble(e));
                }
            }
        }
        return getPrevious();
    }

    @Override
    public double getPrevious() {
        return stack.pop();
    }
}
