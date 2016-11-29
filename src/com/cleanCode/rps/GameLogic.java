package com.cleanCode.rps;

public class GameLogic{

    public String decideWinner(String userInput1, String userInput2){
        if(userInput1.equalsIgnoreCase(Constants.Inputs.R.name())){
            return compareInputWithRock(userInput2);
        }else if(userInput1.equalsIgnoreCase(Constants.Inputs.P.name())){
            return compareInputWithPaper(userInput2);
        } else {
            return compareInputWithScissors(userInput2);
        }
    }

    public String compareInputWithRock(String userInput){
        if(userInput.equalsIgnoreCase(Constants.Inputs.P.name())) {
            return Constants.Results.PAPER_WINS.name();
        } else if(userInput.equalsIgnoreCase(Constants.Inputs.S.name())) {
            return Constants.Results.ROCK_WINS.name();
        }
        return Constants.Results.TIE.name();
    }

    public String compareInputWithPaper(String userInput){
        if(userInput.equalsIgnoreCase(Constants.Inputs.R.name())) {
            return Constants.Results.PAPER_WINS.name();
        } else if(userInput.equalsIgnoreCase(Constants.Inputs.S.name())) {
            return Constants.Results.SCISSORS_WINS.name();
        }
        return Constants.Results.TIE.name();
    }

    public String compareInputWithScissors(String userInput){
        if(userInput.equalsIgnoreCase(Constants.Inputs.R.name())) {
            return Constants.Results.ROCK_WINS.name();
        } else if(userInput.equalsIgnoreCase(Constants.Inputs.P.name())) {
            return Constants.Results.SCISSORS_WINS.name();
        }
        return Constants.Results.TIE.name();
    }
}