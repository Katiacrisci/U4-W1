package day2;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(stringEvenOrOdd("ciao!"));
        System.out.println(annoBisestile(2025));
        printString(5);
        printWhileQ();




    }

    static boolean stringEvenOrOdd(String s) {
        return s.length() % 2 == 0;
    }

    static boolean annoBisestile(int year) {
        return year % 4 == 0 || (year % 100 == 0 && year % 400 == 0);
    }

    static void printString(int number) {
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("the number is out of range");

        }
    }

    static void printWhileQ() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string. prompt ':q' to stop");
        String str = scanner.nextLine();
        while(!Objects.equals(str, ":q")) {
           String[] letters = str.split("");
           for (String letter: letters) {
               System.out.printf(letter + ";");
           }
            System.out.println("enter a string. prompt ':q' to stop");
           str = scanner.nextLine();
        }

    }

}

