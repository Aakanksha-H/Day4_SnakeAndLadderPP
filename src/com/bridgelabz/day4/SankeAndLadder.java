package com.bridgelabz.day4;

public class SankeAndLadder {
    static final int LADDER = 0;
    static final int SNAKE = 1;

    public static void main(String[] args) {
        System.out.println("WELCOME_TO_THE_GAME");
        int position = 0;
        int diceRollCount = 0;
        String playerName = "Mel";
        String playerId = "ID22022";

        while (100 > position) {
            int option = (int) (Math.round(Math.random() * 10) % 3);
            int diceRoll = (int)(Math.random() * 6) + 1;

            switch (option) {
                case SNAKE:
                    diceRollCount ++;
                    position -= diceRoll;

                    System.out.println("The point for the player " + playerName + " with ID: " + playerId + " after dice roll is = " + diceRoll);
                    System.out.println("Dice roll count is " + diceRollCount);
                    System.out.println("You have got the snake, position = " + position + '\n');
                    if(position < 0){
                        position = 0;
                        System.out.println("You have got the snake before and below 0 so start the game again form position " + position + '\n');
                    }
                    break;

                case LADDER:
                    diceRollCount ++;
                    position += diceRoll;

                    System.out.println("The point for the player " + playerName + " with ID: " + playerId + " after dice roll is = " + diceRoll);
                    System.out.println("Dice roll count is " + diceRollCount);
                    System.out.println("You have got the ladder, position  = " + position + '\n');
                    if(position > 100){
                        position -= diceRoll;
                        System.out.println("You have got ahead 100");
                    }
                    break;

                default:
                    diceRollCount ++;
                    System.out.println("Dice roll count is " + diceRollCount);
                    System.out.println("You are at the same position = " + position + '\n');
            }
        }
    }
}
