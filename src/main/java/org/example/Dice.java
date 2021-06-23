package org.example;

public enum Dice {
    D6(6),
    D10(10),
    D20(20),
    D100(100);

    private int number;

    private Dice(int number) {
        this.number = number;
    }
    public int random(Dice diceNr){
        //System.out.println(Dice.valueOf(diceNr));
        String enumswitch = diceNr.toString();
        System.out.println(enumswitch);
        System.out.println(diceNr.number);

        switch (diceNr){
            case D6:
                System.out.println(Dice.valueOf(enumswitch));
                //int intEnum = (int) Dice.valueOf(enumswitch);
                break;
            case D10:
                break;
            default:


        }
        //int tal = new Dice(diceNr.);
        //Random random = new Random(diceNr);
        //return values()[random.nextInt(values().length)];
        return 3;
    }
}
