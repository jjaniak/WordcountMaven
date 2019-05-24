package com.griddynamics;

import com.griddynamics.input.FileInputProcessor;
import com.griddynamics.input.InputProcessor;
import com.griddynamics.input.KeyboardInputProcessor;

public class Launcher {

    public static void main(String[] args)  {

        InputProcessor inputProcessor;
        Counter wordsCounter = new Counter();
        // how? Counter wordsCounter = new Counter(usersInput); // String usersInput = "";

        while (true) {
            System.out.println("You are given a choice: either write something or use a predefined text file as a source.");
            System.out.println("Please type 'A' if you feel like creating your own input. Feeling lazy? Type 'B'.");
            System.out.println("Type it here: ");

            inputProcessor = new KeyboardInputProcessor();

            String choice = inputProcessor.getInput();


            if (choice.equals("A")) {

                System.out.print("Write a string so I can count spaces, special characters, numbers and words in the string: ");

                inputProcessor = new KeyboardInputProcessor();

                String keyboardInput = inputProcessor.getInput();

                System.out.println("The number of spaces in the string: " + wordsCounter.getCountOfSpacesIn(keyboardInput));
                System.out.println("The number of special characters in the string: " + wordsCounter.getCountOfSpecialCharIn(keyboardInput));
                System.out.println("The number of numbers in the string: " + wordsCounter.getCountOfNumbersIn(keyboardInput));
                System.out.println("The number of words in the string: " + wordsCounter.getCountOfWordsIn(keyboardInput) + "\n");

/*                int spaces = wordsCounter.getCountOfSpacesIn(keyboardInput);
                spaces = 0;*/

            } else if (choice.equals("B")) {

                inputProcessor = new FileInputProcessor();

                String fileInput = inputProcessor.getInput();
//                System.out.println("This is the content of the text file: \n\n" + fileInput);

                if (fileInput.equals("end")) {
                    System.out.println("This is the end");
                    break;
                }

                System.out.println("The number of spaces in the text: " + wordsCounter.getCountOfSpacesIn(fileInput));
                System.out.println("The number of special characters in the text: " + wordsCounter.getCountOfSpecialCharIn(fileInput));
                System.out.println("The number of numbers in the text: " + wordsCounter.getCountOfNumbersIn(fileInput));
                System.out.println("The number of words in the text: " + wordsCounter.getCountOfWordsIn(fileInput) + "\n");

            } else if (choice.equals("end")) {
                System.out.println("”What we call the beginning is often the end. And to make an end is to make a beginning. " +
                        "The end is where we start from.”\n" +
                        "T.S. Eliot");
                break;
            } else {
                System.out.println("You only need to type 'A' or 'B'. Please try again.");
                System.out.println("If you want to exit the program, type 'end' \n");
            }
        }
    }
}