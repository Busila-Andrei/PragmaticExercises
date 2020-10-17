package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class CountingTheNumberOfCharacters {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String string;
        System.out.print("What is the input string? ");
        string = scanner.nextLine();
        System.out.println(string + " has " + string.length() + " characters.");
    }
}
