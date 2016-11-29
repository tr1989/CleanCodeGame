package com.cleanCode.rps;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        System.out.println("Game starts here...");
        System.out.println("Please enter input for user 1");
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        String input1 = game.getValidInputFromConsole(scanner);
        System.out.println("input 1 is ::"+input1);

        System.out.println("Please enter input for user 2");
        String input2 = game.getValidInputFromConsole(scanner);
        System.out.println("input 2 is ::"+input2);

        GameLogic gameLogic = new GameLogic();
        String result = gameLogic.decideWinner(input1, input2);
        System.out.println("Result is :: " +result);

    }

    public String getValidInputFromConsole(Scanner scanner) {
        String input =  scanner.nextLine();
        UserInputCollector userInputCollector =  new UserInputCollector();
        while(!userInputCollector.isInputValid(input)) {
            System.out.println(input + " is not a valid input, please enter again");
            input = getValidInputFromConsole(scanner);
        }
        return input;
    }
}
