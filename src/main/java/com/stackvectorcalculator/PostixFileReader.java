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

Sirve para leer el datos.txt

*/

package com.stackvectorcalculator;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PostixFileReader {
    private String path = "./src/main/java/com/stackvectorcalculator/";

    /*
     * Constructor de la clase PostixFileReader
     */
    public PostixFileReader(String filename) {
        this.path = this.path.concat(filename);
    }

    
    /**
     * Reads each line of text file and return it as arraylist 
     * @return ArrayList<String>
     */
    public ArrayList<String> readExpressions() {
        final ArrayList<String> expressions = new ArrayList<String>();

        try {
            File file = new File(path);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
                expressions.add(sc.nextLine().trim());

            sc.close();
            return expressions;

        } catch (Exception e) {
            return expressions;
        }
    }

}