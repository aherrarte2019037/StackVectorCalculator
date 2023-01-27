/*
Profesor: Douglas Leonel
Auxiliar: Fernanda Esquivel y Francisco Castillo

INTEGRANTES: 
Sergio Alejandro Orellana Colindres, 221122
Francis Gabriela Aguilar Leal, 22243
Angel Andres Herrarte Lorenzana, 22873

27/01/2023

Hoja de Trabajo 2 - ADT

Curso: Algoritmos y Estructuras de datos
Sección: 20

Sirve para hacer todas las operaciones del .txt

*/

package com.stackvectorcalculator;

public class Calculadora implements ICalculator{
    StackVector<Double> stack = new StackVector<>();

    @Override
    public double evaluate(String expression) throws ArithmeticException {

        for (int i = 0; i < expression.length(); i++) {

            String e = String.valueOf(expression.charAt(i));

            /*
             * Verifica si es espacio
             */
            if (!e.equals(" ")){
                /*
                 * Reconoce los diferentes operadores del Postflix
                 */
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

                /*
                 * Cuando es un operando se realiza el push
                 */
                }else { 
                    stack.push(Double.parseDouble(e));
                }
            }
        }
        return getPrevious();
    }

    /*
     * Obtiene el dato anterior
     */
    @Override
    public double getPrevious() {
        return stack.pop();
    }
}
