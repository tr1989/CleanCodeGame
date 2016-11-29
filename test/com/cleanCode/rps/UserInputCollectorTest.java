package com.cleanCode.rps;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserInputCollectorTest {
    @Test
    public void testInputValidatorForUserOne(){
        UserInputCollector userInputCollector = new UserInputCollector("E", "R");
        boolean actual = true;
        boolean expected = userInputCollector.isInputValid(userInputCollector.getUserInput1());
        Assert.assertEquals(actual, expected);
    }
}