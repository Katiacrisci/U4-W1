package app;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Methods.multiply(10, 9));

        System.out.println(Methods.concat("mario", 10));

        String[] initialArray = new String[] {"one", "two", "four", "five", "six"};
        System.out.println(initialArray.length);
        String[] finalArray = Methods.insertInArray(initialArray, "three");

        for (int i = 0; i < finalArray.length; i++) {
            System.out.println(finalArray[i]);
        }

        Scanner scanner = new Scanner(System.in);
        Methods.readThreeLines(scanner);
        scanner.close();







    }
}
