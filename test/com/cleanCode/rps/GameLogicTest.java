package com.cleanCode.rps;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameLogicTest {

    @Test
    public void testGameLogicForRockAndPaper(){
        UserInputCollector userInput1 = new UserInputCollector("R");
        UserInputCollector userInput2 =  new UserInputCollector("P");

        GameLogic gameLogic = new GameLogic();

        String actual = String.valueOf(Constants.Results.PAPER_WINS);
        String expected = gameLogic.decideWinner(userInput1.getUserInput(), userInput2.getUserInput());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGameLogicForRockAndScissors(){
        UserInputCollector userInput1 = new UserInputCollector("R");
        UserInputCollector userInput2 =  new UserInputCollector("S");

        GameLogic gameLogic = new GameLogic();

        String actual = String.valueOf(Constants.Results.ROCK_WINS);
        String expected = gameLogic.decideWinner(userInput1.getUserInput(), userInput2.getUserInput());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGameLogicForRockAndRock(){
        UserInputCollector userInput1 = new UserInputCollector("R");
        UserInputCollector userInput2 =  new UserInputCollector("R");

        GameLogic gameLogic = new GameLogic();

        String actual = String.valueOf(Constants.Results.TIE);
        String expected = gameLogic.decideWinner(userInput1.getUserInput(), userInput2.getUserInput());
        Assert.assertEquals(actual, expected);
    }
}