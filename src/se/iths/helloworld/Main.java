package se.iths.helloworld;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Box smallBox = new Box();
        smallBox.height = 5;
        smallBox.length = 10;
        smallBox.width = 2;

        Box largeBox = new Box();
        largeBox.height = 10;
        largeBox.length = 15;
        largeBox.width = 20;

        System.out.println(largeBox);

    }
}
