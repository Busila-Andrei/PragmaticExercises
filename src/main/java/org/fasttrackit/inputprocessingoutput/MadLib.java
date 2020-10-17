package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String noun, verb, adjective,adverb;

        System.out.print("Enter a noun: ");
        noun = scanner.next();

        System.out.print("Enter a verb: ");
        verb = scanner.next();

        System.out.print("Enter an adjective: ");
        adjective = scanner.next();

        System.out.print("Enter an adverb: ");
        adverb = scanner.next();

        System.out.println("Do you " + verb + " you " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
