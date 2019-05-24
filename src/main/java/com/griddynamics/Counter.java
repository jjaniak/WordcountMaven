package com.griddynamics;

public class Counter {
/*    private String source;

    public Counter (String userSource) {
        source = userSource;
    }*/

    public int getCountOfSpecialCharIn(String source) {

        return source.replaceAll("[\\w\\s]","").length();

    }

    public int getCountOfSpacesIn(String source) {
        int spaceCount = 0;

        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == ' ')
                spaceCount++;
        }
        return spaceCount;
    }

    private String[] splitString(String source) {
        return source
                .trim()
                .replaceAll(" +", " ")
                .split("\\s");
    }

    public int getCountOfNumbersIn(String source) {
        String[] contentArray = splitString(source);
        int numbersCount = 0;

        for (String element : contentArray) {
            if (element.matches("\\d+"))
            numbersCount++;
        }

        return numbersCount;
    }

    public int getCountOfWordsIn(String source) {
        String[] contentArray = splitString(source);
        int wordsCount = 0;

        for (String element : contentArray) {
            if (isWord(element))
                wordsCount++;
        }

        return wordsCount;
    }

    private boolean isWord(String source) {
        if (source.length() == 0) {
            return false;
        }

        if (source.length() == 1 && (source.charAt(0) == '.' || source.charAt(0) == ','
                || source.charAt(0) == '?' || source.charAt(0) == '!') ) {
            return false;
        }

        for (int i = 0; i < source.length() - 1; i++) {
            if (!(Character.isLetter(source.charAt(i))))
                return false;
        }

        if (Character.isLetter(source.charAt(source.length() - 1)) ||    /* before last letter  */
                source.charAt(source.length() - 1) == '.' || source.charAt(source.length() - 1) == ',' ||  /* last letter */
                source.charAt(source.length() - 1) == '?' || source.charAt(source.length() - 1) == '!') {
            return true;
        } else {
            return false;
        }
    }
}