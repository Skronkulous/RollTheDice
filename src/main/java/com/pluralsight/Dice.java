package com.pluralsight;

public class Dice {
    public static void main(String[] args) {
        int roll1, roll2, sum;
        int twoCount = 0, fourCount = 0, sixCount = 0, sevenCount = 0;
        Dice dice = new Dice();

        for(int j = 0; j <= 100; j++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;
            System.out.println("Roll " + j + ": " + roll1 + " + " + roll2 + " Sum: " + sum);
            switch(sum){
                case 2:
                    twoCount++;
                    break;
                case 4:
                    fourCount++;
                    break;
                case 6:
                    sixCount++;
                    break;
                case 7:
                    sevenCount++;
                    break;
            }

        }
        System.out.println("Sums of 2: " + twoCount + "\nSums of 4: " + fourCount + "\nSums of 6: " + sixCount + "\nSums of 7: " + sevenCount);
    }
    public static int roll(){
        int rndmNum = 1 + (int)(Math.random() * 6);
        return rndmNum;
    }
}
