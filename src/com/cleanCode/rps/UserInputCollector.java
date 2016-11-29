package com.cleanCode.rps;

public class UserInputCollector {
    private String userInput;

    public UserInputCollector(String userInput) {
        this.userInput = userInput;
    }

    public String getUserInput() {
        return userInput;
    }

    public boolean isInputValid(String userInput) {
        if (userInput.equalsIgnoreCase(String.valueOf(Constants.Inputs.R)) || userInput.equalsIgnoreCase(String.valueOf(Constants.Inputs.P))
                || userInput.equalsIgnoreCase(String.valueOf(Constants.Inputs.S))) {
            return true;
        } else {
            return false;
        }
    }
}