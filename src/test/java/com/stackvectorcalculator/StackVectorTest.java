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

Clase que sirve para realizar los diferentes Test

*/

package com.stackvectorcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StackVectorTest {
    @Test
    public void shouldPushElementToTop() {
        final StackVector<Integer> stackVector = new StackVector<Integer>();
        stackVector.push(1);

        assertEquals(Integer.valueOf(1), stackVector.peek());
    }

    @Test
    public void shouldRemoveLastElementPushed() {
        final StackVector<Integer> stackVector = new StackVector<Integer>();
        stackVector.push(1);
        stackVector.push(2);

        stackVector.pop();

        assertEquals(Integer.valueOf(1), stackVector.peek());
    }

    @Test
    public void shouldInitializeEmpty() {
        final StackVector<Integer> stackVector = new StackVector<Integer>();
        assertEquals(true, stackVector.empty());
    }
}
