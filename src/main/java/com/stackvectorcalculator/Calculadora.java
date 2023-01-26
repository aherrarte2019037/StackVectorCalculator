package com.stackvectorcalculator;

public class Calculadora implements ICalculator{
    StackVector<Double> stack = new StackVector<>();

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
                    switch (e) {
                        case "+":
                            stack.push(operandoA + operandoB);
                            break;
                        case "-":
                            stack.push(operandoA - operandoB);
                            break;
                        case "*":
                            stack.push(operandoA * operandoB);
                            break;
                        case "/":
                            stack.push(operandoA / operandoB);
                            break;
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
