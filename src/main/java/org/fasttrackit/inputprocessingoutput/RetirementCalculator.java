package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class RetirementCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String age, retire;

        System.out.print("What is your current age? ");
        age = scanner.next();

        System.out.print("At what age would you like to retire? ");
        retire = scanner.next();

        int untilAge = Integer.parseInt(retire) - Integer.parseInt(age);
        int year = 2015;

        System.out.println("You have " + untilAge + " years left until you can retire.");

        System.out.println("It's " + year + ", so you can retire in " + (year + untilAge) + ".");
    }
}
