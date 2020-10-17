package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class SayingHello {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String name;
        System.out.print("What is your name? ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
