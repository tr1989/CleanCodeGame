package com.cleanCode.rps;

public class UserInputCollector {
    private String userInput1;
    private String userInput2;

    public UserInputCollector(String userInput1, String userInput2) {
        this.userInput1 = userInput1;
        this.userInput2 = userInput2;
    }

    public String getUserInput1() {
        return userInput1;
    }

    public String getUserInput2() {
        return userInput2;
    }

    public boolean isInputValid(String userInput) {
        if (userInput.equalsIgnoreCase("R")
                || userInput.equalsIgnoreCase("P") || userInput.equalsIgnoreCase("S")) {
            return true;
        } else {
            return false;
        }
    }
}