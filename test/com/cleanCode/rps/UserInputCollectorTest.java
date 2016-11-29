package com.cleanCode.rps;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserInputCollectorTest {
    @Test
    public void testInputValidatorForUserOnePositive(){
        UserInputCollector userInputCollector = new UserInputCollector("S", "R");
        boolean actual = true;
        boolean expected = userInputCollector.isInputValid(userInputCollector.getUserInput1());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testInputValidatorForUserOneNegative(){
        UserInputCollector userInputCollector = new UserInputCollector("E", "R");
        boolean actual = false;
        boolean expected = userInputCollector.isInputValid(userInputCollector.getUserInput1());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testInputValidatorForUserTwoPositive(){
        UserInputCollector userInputCollector = new UserInputCollector("S", "R");
        boolean actual = true;
        boolean expected = userInputCollector.isInputValid(userInputCollector.getUserInput2());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testInputValidatorForUserTwoNegative(){
        UserInputCollector userInputCollector = new UserInputCollector("S", "X");
        boolean actual = false;
        boolean expected = userInputCollector.isInputValid(userInputCollector.getUserInput2());
        Assert.assertEquals(actual, expected);
    }
}