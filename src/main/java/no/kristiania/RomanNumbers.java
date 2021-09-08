package no.kristiania;

import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {
        System.out.println("Which number do you want to convert to roman?");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(toRoman(input));
    }

    public static String toRoman(int input){
        String result = "";
        String[] RomanNumberArray = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        Integer[] NumberArray = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        for (int i = NumberArray.length-1; i >= 0 ; i--) {
            String RomanNumber = RomanNumberArray[i];
            int Number = NumberArray[i];
            int timesRepeated = input/Number;
            if (Number<=input){
                for (int j = 0; j < timesRepeated; j++) {
                    result += RomanNumber;
                }
                input = input%Number;
            }


        }


        return result;
    }

}
