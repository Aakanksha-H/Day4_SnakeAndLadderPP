package com.bridgelabz.day4;

public class SankeAndLadder {
    public static void main(String[] args) {
        System.out.println("WELCOME_TO_THE_GAME");
        int diceRoll = (int) (Math.round(Math.random() * 10) % 7);;
        String playerName = "Mel";
        String playerId = "ID22022";

        System.out.println("The point for the player " + playerName + " with ID: " + playerId + " after dice roll is = " + diceRoll);
    }
}
