package com.cleanCode.rps;

public class UserInputCollector {
    private String userInput1;
    private String userInput2;

    public UserInputCollector(String userInput1, String userInput2) {
        this.userInput1 = userInput1;
        this.userInput2 = userInput2;
    }

    public void setUserInput1(String userInput1) {
        this.userInput1 = userInput1;
    }

    public String getUserInput2() {
        return userInput2;
    }
}