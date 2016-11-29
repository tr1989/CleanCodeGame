package com.cleanCode.rps;

import org.junit.Assert;
import org.junit.Test;

public class UserInputCollectorTest {
    @Test
    public void testInputValidatorForUserPositive(){
        UserInputCollector userInputCollector = new UserInputCollector("S");
        boolean expected = userInputCollector.isInputValid(userInputCollector.getUserInput());
        Assert.assertTrue(expected);
    }

    @Test
    public void testInputValidatorForUserNegative(){
        UserInputCollector userInputCollector = new UserInputCollector("E");
        boolean expected = userInputCollector.isInputValid(userInputCollector.getUserInput());
        Assert.assertFalse(expected);
    }

}