package org.example.dice;

import java.util.Random;

public enum Dice {

    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);

    private static Random random = new Random();

    private int value;

    Dice(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Dice rollDice(){
       int num = 0;  random.nextInt(7);
       while(num == 0){
           num = random.nextInt(7);
       }
       return Dice.values()[num-1];
    }

}
