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
        return userInput.equalsIgnoreCase(Constants.Inputs.R.name()) || userInput.equalsIgnoreCase(Constants.Inputs.P.name())
                || userInput.equalsIgnoreCase(Constants.Inputs.S.name());
    }
}