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

Describe la clase Vector con genéricos

*/

package com.stackvectorcalculator;

import java.util.EmptyStackException;
import java.util.Vector;

public class StackVector<E> implements IStack<E> {
    protected Vector<E> data = new Vector<E>(1);

    
    /** 
     * Add new element to top
     * @param item
     */
    @Override
    public void push(E item) {
        data.addElement(item);
    }

    
    /** 
     * Remove last element pushed and return value
     * @return E
     * @throws EmptyStackException
     */
    @Override
    public E pop() throws EmptyStackException {
        return data.remove(data.size() - 1);
    }

    
    /** 
     * Return last element pushed
     * @return E
     * @throws EmptyStackException
     */
    @Override
    public E peek() throws EmptyStackException {
        return data.lastElement();
    }

    
    /** 
     * Return true if stack is empty
     * @return boolean
     */
    @Override
    public boolean empty() {
        return data.isEmpty();
    }

    
    /** 
     * Returns the size of stack
     * @return int
     */
    @Override
    public int size() {
        return data.size();
    }

}
