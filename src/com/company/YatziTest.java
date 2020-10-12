
package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    @Test
    void isYatziWhenAllDiceMatches() {
        Die[] dice = new Die[5];
        for (int y = 0; y < 5; y++) {
            dice[y] = new Die();
            dice[y].value = 5;
        }
        assertTrue(YatziMain.isYatzi(dice));
    }


    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        for (int y = 0; y < 5; y++) {
            dice[y] = new Die();
            dice[y].DieRoll();
        }
        assertFalse(YatziMain.isYatzi(dice));
    }
}

