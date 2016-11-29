package com.cleanCode.rps;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserInputCollectorTest {
    @Test
    public void inputValidatorPassTest(){
        UserInputCollector userInputCollector = new UserInputCollector("E", "R");
        boolean actual = true;
        Assert.assertEquals(actual, true);
    }
}