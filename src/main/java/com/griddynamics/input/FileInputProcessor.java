package com.griddynamics.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputProcessor implements InputProcessor {

    private File file;
    private KeyboardInputProcessor keyboardInputProcessor;

    public String getInput() {

      //  File file = new File("/Users/jjaniak/IdeaProjects/WordCount/resources/file.txt");

        keyboardInputProcessor = new KeyboardInputProcessor();

        String textInput = "";

        boolean inputIsNotValid = true;

        while (inputIsNotValid) {

            System.out.println("Please provide the file path: ");

            try {
                String path = keyboardInputProcessor.getInput();
                if (path.equals("end"))
                    return path;
                file = new File(path);
                Scanner scan = new Scanner(file);
                scan.useDelimiter("\\z");
                textInput = scan.next();
                inputIsNotValid = false;

            } catch (FileNotFoundException e) {
                System.out.println("The file does not exist. Please make sure the file path is correct.");
            }
        }
        return textInput;
    }
}