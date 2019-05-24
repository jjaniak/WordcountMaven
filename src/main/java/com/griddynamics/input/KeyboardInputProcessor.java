package com.griddynamics.input;

import java.util.Scanner;

public class KeyboardInputProcessor implements InputProcessor {

    public String getInput() {

        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();
        return userInput;
    }

}
