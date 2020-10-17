package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class PrintingQuotes {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String quote;
        String author;
        System.out.print("What is the quote? ");
        quote = scanner.nextLine();
        System.out.print("Who said it? ");
        author = scanner.nextLine();
        System.out.println(author + " says, \"" + quote + "\"");
    }
}
