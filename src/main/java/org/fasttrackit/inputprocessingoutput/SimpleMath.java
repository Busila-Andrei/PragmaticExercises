package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumber, secondNumber;
        int a, b;

        System.out.print("What is the first number? ");
        firstNumber = scanner.next();

        System.out.print("What is the second number? ");
        secondNumber = scanner.next();

        a = Integer.parseInt(firstNumber);
        b = Integer.parseInt(secondNumber);

        System.out.println(a + " + " + b + " = " + (a + b) + "\n" +
                a + " - " + b + " = " + (a - b) + "\n" +
                a + " * " + b + " = " + (a * b) + "\n" +
                a + " / " + b + " = " + (a / b));
    }
}
