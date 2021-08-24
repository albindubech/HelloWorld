package se.iths.helloworld;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");

        System.out.println("How many years have you been using Java?");
        int yearsOfJavaProgramming = Integer.parseInt(scanner.nextLine());

        if( yearsOfJavaProgramming > 5)
            System.out.println("You must be a senior programmer.");
        else
            System.out.println("You are a junior programmer.");

    }
}
