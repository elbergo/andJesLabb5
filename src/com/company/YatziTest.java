package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    @Test
    void isYatziWhenAllDiceMatches() {
        Die[] dice = new Die[5];
        for (int y = 1; y < 5; y++) {
            dice[y] = new Die();
            //dice[y].value(5);
        }
        //assertTrue(YatziMain.startGame(dice));
    }


    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        for(Die die: dice) {
            die.value = 6;
        }
        dice[5].value = 1;
        //Assert something?
    }
}
