package org.launchcode.exercises;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        Divide(15, 1);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> studentFile : studentFiles.entrySet()) {
            System.out.println(studentFile.getKey() + " received " + CheckFileExtension(studentFile.getValue()) + " point.");
        }
    }

    public static void Divide(int x, int y)
    {
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(x/y);
        }

    }

    public static int CheckFileExtension(String fileName)
    {
        int points = 0;
        if (fileName == null || fileName == "") {
            try {
                throw new FileNotFoundException("File submitted is not a .java file.");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            points = -1;
        } else if (fileName.endsWith(".java")) {
            points = 1;
        } else if (!fileName.endsWith(".java")) {
            points = 0;
        }

        return points;

    }

}
