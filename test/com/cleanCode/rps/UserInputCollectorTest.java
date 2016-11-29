package com.cleanCode.rps;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserInputCollectorTest {
    @Test
    public void testInputValidatorForUserPositive(){
        UserInputCollector userInputCollector = new UserInputCollector("S");
        boolean actual = true;
        boolean expected = userInputCollector.isInputValid(userInputCollector.getUserInput());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testInputValidatorForUserNegative(){
        UserInputCollector userInputCollector = new UserInputCollector("E");
        boolean actual = false;
        boolean expected = userInputCollector.isInputValid(userInputCollector.getUserInput());
        Assert.assertEquals(actual, expected);
    }

}