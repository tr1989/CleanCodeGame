package com.cleanCode.rps;

import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class GameTest {
    @Test
    public void testGetValidInputFromConsole(){
        System.setIn(new ByteArrayInputStream("R".getBytes()));
        Scanner scanner = new Scanner(System.in);
        Game game =  new Game();
        String expected = game.getValidInputFromConsole(scanner);
        Assert.assertNotNull(expected);
    }
}