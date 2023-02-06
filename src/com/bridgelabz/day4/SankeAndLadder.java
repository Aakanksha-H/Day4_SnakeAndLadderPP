package com.bridgelabz.day4;

public class SankeAndLadder {
    static final int LADDER = 0;
    static final int SNAKE = 1;

    public static void main(String[] args) {
        System.out.println("WELCOME_TO_THE_GAME");
        int diceRoll = (int)(Math.random() * 6) + 1;;
        int position = 0;
        String playerName = "Mel";
        String playerId = "ID22022";

        System.out.println("The point for the player " + playerName + " with ID: " + playerId + " after dice roll is = " + diceRoll);
        while (100 > position) {
            int option = (int) (Math.round(Math.random() * 10) % 3);
            switch (option) {
                case SNAKE:
                    position -= diceRoll;
                    System.out.println("You have got the snake, position = " + position);
                    if(position < 0){
                        position = 0;
                        System.out.println("You have got the snake before and below 0 so start the game again form position " + position);
                    }
                    break;

                case LADDER:
                    position += diceRoll;
                    System.out.println("You have got the ladder, position  = " + position);
                    break;

                default:
                    System.out.println("You are at the same position = " + position);
            }
        }
    }
}
