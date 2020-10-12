package com.company;

import java.util.Scanner;


public class YatziMain {

    private static Die[] dice;
    private static int turn = 0;

    private static void createDice() {  // Create five dices
        dice = new Die[5];
        for (int y = 0; y < 5; y++) {
            dice[y] = new Die();
        }
    }


    private static void runGame() {  // Starts the game
        System.out.println("Welcome to YATZI!");
        while (turn < 3) {
            System.out.println("Starting turn " + (turn + 1) + " of 3, rolling dice.");
            for (int i = 0; i < dice.length; i++) {
                dice[i].DieRoll();
                System.out.println(i + ": " + dice[i].getString());
            }

            if (isYatzi(dice)) { // Prints out if there is Yatzi
                System.out.println("You got YATZI! in " + dice[0].value + "'s");
                return;
            } else if (turn != 2) { //Starts 3 turns
                System.out.println("Want to throw again? (y for yes, anything else for no)");
                Scanner sc = new Scanner(System.in);
                if (sc.next().equals("y")) {
                    ++turn;

                } else break;

            } else {
                System.out.println("Game over! Want to play again?");
                Scanner sc = new Scanner(System.in);
                if (sc.next().equals("y")) {
                    turn = 0;

                } else break;

            }
        }

    }

    public static boolean isYatzi(Die[] dice) {  // Checks for Yatzi
        for (int y = 1; y < 5; y++) {
            if (dice[y].value != dice[y - 1].value) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        createDice();
        runGame();


    }


}
