package com.company;

public class Die {
    public int value = 0;

    /*public Die() {
        value = (int) Math.random(); // Överflödig kod
    }*/

    public int DieRoll() {
        value = (int)(Math.random()*6+1);
        return value;
    }

    /*public int DieReroll() {
        return DieRoll(); // Överflödig kod
    }*/

    public String getString() {
        return "Dice shows " + value;
    }
}

