package com.cleanCode.rps;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameLogicTest {

    @Test
    public void testGameLogic(){
        UserInputCollector userInput1 = new UserInputCollector("S");
        UserInputCollector userInput2 =  new UserInputCollector("R");

        GameLogic gameLogic = new GameLogic();

        String actual = "true";
        String expected = gameLogic.decideWinner(userInput1.getUserInput(), userInput2.getUserInput());
        Assert.assertEquals(actual, expected);
    }
}