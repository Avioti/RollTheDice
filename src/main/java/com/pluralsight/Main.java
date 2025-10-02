package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1 = 0;
        int roll2 = 0;
        int count_2 = 0;
        int count_4 = 0;
        int count_6 = 0;
        int count_7 = 0;

        for (int i = 1; i <= 100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;
            switch (sum){
                case 2:
                    count_2 += 1;
                    break;
                case 4:
                    count_4 += 1;
                    break;
                case 6:
                    count_6 += 1;
                    break;
                case 7:
                    count_7 += 1;
            }
            System.out.println("Roll "+ i + ": " +  roll1 + " - " + roll2 + " Sum: " + sum );
            if(i == 100){
                System.out.println(count_2);
                System.out.println(count_4);
                System.out.println(count_6);
                System.out.println(count_7);
            }

        }
    }
}
