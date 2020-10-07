package com.company;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    @Test
    void isYatziWhenAllDiceMatches() {
        Die[] dice = new Die[5];
        for(Die die: dice) {
            die.value = 6;
        }
        //Assert something?
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
