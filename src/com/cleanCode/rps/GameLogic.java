package com.cleanCode.rps;

public class GameLogic{

    public String decideWinner(String userInput1, String userInput2){
        if(userInput1.equalsIgnoreCase(String.valueOf(Constants.Inputs.R))){
            return compareInputWithRock(userInput2);
        }
        return "true";
    }

    public String compareInputWithRock(String userInput){
        if(userInput.equalsIgnoreCase(String.valueOf(Constants.Inputs.P))) {
            return Constants.Results.PAPER_WINS.toString();
        } else if(userInput.equalsIgnoreCase(String.valueOf(Constants.Inputs.S))) {
            return Constants.Results.ROCK_WINS.toString();
        }
        return Constants.Results.TIE.toString();
    }
}