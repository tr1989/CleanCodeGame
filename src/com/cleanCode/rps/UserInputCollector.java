package com.cleanCode.rps;

public class UserInputCollector {
    private String userInput;

    public UserInputCollector(String userInput) {
        this.userInput = userInput;
    }

    public UserInputCollector() {}

    public String getUserInput() {
        return userInput;
    }

    public boolean isInputValid(String userInput) {
        return userInput.equalsIgnoreCase(String.valueOf(Constants.Inputs.R)) || userInput.equalsIgnoreCase(String.valueOf(Constants.Inputs.P))
                || userInput.equalsIgnoreCase(String.valueOf(Constants.Inputs.S));
    }
}