package no.kristiania;

import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {
        System.out.println("Which number do you want to convert to roman?");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(toRoman(input));
    }

    public static int toRoman(int input){
        return input+1;
    }

}
