package com.stackvectorcalculator;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PostixFileReader {
    private String path = "./src/main/java/com/stackvectorcalculator/";

    public PostixFileReader(String filename) {
        this.path = this.path.concat(filename);
    }

    // Reads each line of text file and return it as arraylist
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