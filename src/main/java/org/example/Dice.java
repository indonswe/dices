package org.example;

import java.util.Random;

public enum Dice {
    D6(6),
    D10(10),
    D20(20),
    D100(100);

    Dice(int i) {

    }
    public int random(Enum diceNr){
        int tal = new Dice(diceNr);
        Random random = new Random(diceNr);
        return values()[random.nextInt(values().length)];
    }
}
