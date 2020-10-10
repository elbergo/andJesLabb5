package com.company;

public class Die {
    public int value = 0;

    public void DieRoll() {
        value = (int)(Math.random()*6+1);
    }

    public String getString() {
        return "Dice shows " + value;
    }

}
