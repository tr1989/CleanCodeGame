package com.cleanCode.rps;

import org.junit.Assert;
import org.junit.Test;

public class GameLogicTest {

    @Test
    public void testGameLogicForRockAndPaper(){
        UserInputCollector userInput1 = new UserInputCollector("R");
        UserInputCollector userInput2 =  new UserInputCollector("P");

        GameLogic gameLogic = new GameLogic();

        String actual = Constants.Results.PAPER_WINS.name();
        String expected = gameLogic.decideWinner(userInput1.getUserInput(), userInput2.getUserInput());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGameLogicForRockAndScissors(){
        UserInputCollector userInput1 = new UserInputCollector("R");
        UserInputCollector userInput2 =  new UserInputCollector("S");

        GameLogic gameLogic = new GameLogic();

        String actual = Constants.Results.ROCK_WINS.name();
        String expected = gameLogic.decideWinner(userInput1.getUserInput(), userInput2.getUserInput());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGameLogicForRockAndRock(){
        UserInputCollector userInput1 = new UserInputCollector("R");
        UserInputCollector userInput2 =  new UserInputCollector("R");

        GameLogic gameLogic = new GameLogic();

        String actual = Constants.Results.TIE.name();
        String expected = gameLogic.decideWinner(userInput1.getUserInput(), userInput2.getUserInput());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGameLogicForPaperAndRock(){
        UserInputCollector userInput1 = new UserInputCollector("P");
        UserInputCollector userInput2 =  new UserInputCollector("R");

        GameLogic gameLogic = new GameLogic();

        String actual = Constants.Results.PAPER_WINS.name();
        String expected = gameLogic.decideWinner(userInput1.getUserInput(), userInput2.getUserInput());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGameLogicForPaperAndScissors(){
        UserInputCollector userInput1 = new UserInputCollector("P");
        UserInputCollector userInput2 =  new UserInputCollector("S");

        GameLogic gameLogic = new GameLogic();

        String actual = Constants.Results.SCISSORS_WINS.name();
        String expected = gameLogic.decideWinner(userInput1.getUserInput(), userInput2.getUserInput());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGameLogicForPaperAndPaper(){
        UserInputCollector userInput1 = new UserInputCollector("P");
        UserInputCollector userInput2 =  new UserInputCollector("P");

        GameLogic gameLogic = new GameLogic();

        String actual = Constants.Results.TIE.name();
        String expected = gameLogic.decideWinner(userInput1.getUserInput(), userInput2.getUserInput());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGameLogicForScissorsAndRock(){
        UserInputCollector userInput1 = new UserInputCollector("S");
        UserInputCollector userInput2 =  new UserInputCollector("R");

        GameLogic gameLogic = new GameLogic();

        String actual = Constants.Results.ROCK_WINS.name();
        String expected = gameLogic.decideWinner(userInput1.getUserInput(), userInput2.getUserInput());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGameLogicForScissorsAndPaper(){
        UserInputCollector userInput1 = new UserInputCollector("S");
        UserInputCollector userInput2 =  new UserInputCollector("P");

        GameLogic gameLogic = new GameLogic();

        String actual = Constants.Results.SCISSORS_WINS.name();
        String expected = gameLogic.decideWinner(userInput1.getUserInput(), userInput2.getUserInput());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGameLogicForScissorsAndScissors(){
        UserInputCollector userInput1 = new UserInputCollector("S");
        UserInputCollector userInput2 =  new UserInputCollector("S");

        GameLogic gameLogic = new GameLogic();

        String actual = Constants.Results.TIE.name();
        String expected = gameLogic.decideWinner(userInput1.getUserInput(), userInput2.getUserInput());
        Assert.assertEquals(actual, expected);
    }
}