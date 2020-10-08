package com.company;

import java.util.Scanner;


public class YatziMain {

    public static Die[] dice;
    public static int iturn = 0;

    private static boolean isYatzi(Die[] dice) {
        //changed var name
        for (int j = 1; j < 5; j++) {
            if (dice[j].value != dice[j - 1].value) {
                return false; // lagt till en break
            }
        }
        return true;

    }



    private static void listDice() {  //listar upp 5 tärningar, startar spelet
        dice = new Die[5];
        for (int d = 0; d < 5; d++) {
            dice[d] = new Die();
        }
    }

    private static void startGame() {
        while (iturn < 3) {
            System.out.println("Starting turn " + (iturn + 1) + " of 3, rolling dice.");
            for (int i = 0; i < dice.length; i++) {
                dice[i].DieRoll();
                //dice[i].value = 5; //Test if yatzi work
                System.out.println(i + ": " + dice[i].getString());
            }


            //YATZI

            if (isYatzi(dice)) {
                System.out.println("You got YATZI! in " + dice[0].value + "'s");
                return;
            } else if (iturn != 2) { //Here we check if there is no Yatzy: then we check what turn we are on and asks the player if we want to continue or not
                System.out.println("Want to throw again? (y for yes, anything else for no)");
                Scanner sc = new Scanner(System.in);
                if (sc.next().equals("y")) {
                    ++iturn;

                }
            } else {
                System.out.println("Game over! Want to play again?");
                Scanner sc = new Scanner(System.in);
                if (sc.next().equals("y")) {
                    iturn = 0;
                } else {
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to YATZI!");
        listDice();
        startGame();


    }


}
