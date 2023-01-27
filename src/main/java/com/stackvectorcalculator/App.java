/*
Profesor: Douglas Leonel
Auxiliar: Fernanda Esquivel y Francisco Castillo

INTEGRANTES: 
Sergio Alejandro Orellana Colindres, 221122
Francis Gabriela Aguilar Leal, 22243
Angel Andres Herrarte Lorenzana, 22873

26/01/2023

Hoja de Trabajo 2 - ADT

Curso: Algoritmos y Estructuras de datos
Sección: 20

Sirve para mostrar al usuario el resultado de los datos en el .txt

*/

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
