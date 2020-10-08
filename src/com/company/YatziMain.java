package com.company;

import java.util.Scanner;


public class YatziMain {

    public static Die[] ds;
    public static boolean gameIsOn = true;
    public static int iturn = 0;

    private static void listDice() {  //listar upp 5 tärningar, startar spelet
        ds = new Die[5];
        for (int d = 0; d < 5; d++) {
            ds[d] = new Die();
        }
    }

    private static void startGame() {
        while (gameIsOn) {
            System.out.println("Welcome to Yatzi!");
            while (iturn < 3) {
                System.out.println("Starting turn " + (iturn + 1) + " of 3, rolling dice.");
                for (int i = 0; i < ds.length; i++) {
                    ds[i].DieRoll();
                    //ds[i].value = 5; //Test if yatzi work
                    System.out.println(i + ": " + ds[i].getString());
                }


                //YATZI
                boolean yatzi = true; //changed var name
                for (int j = 1; j < 5; j++) {
                    if (ds[j].value != ds[j - 1].value) {
                        yatzi = false;
                        break; // lagt till en break
                    }
                }
                if (yatzi) {
                    System.out.println("You got YATZI! in " + ds[0].value + "'s");
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
                        gameIsOn = !gameIsOn;
                        break;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {

        listDice();
        startGame();


    }


}
