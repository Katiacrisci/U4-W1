package app;

import java.util.Scanner;

public class Methods {
     static int multiply(int num1, int num2) {
         return num1 * num2;
    }

    static String concat(String s, int num1) {
         return s + num1;
    }

    static String[] insertInArray(String[] array, String str) {
         String[] resultArray = new String[6];
         resultArray[0] = array[0];
         resultArray[1] = array[1];
         resultArray[2] = str;
         resultArray[3] = array[2];
         resultArray[4] = array[3];
         resultArray[5] = array[4];
         return resultArray;
    }

    static void readThreeLines(Scanner scanner) {
         String s1, s2, s3;
         s1 = scanner.nextLine();
         s2 = scanner.nextLine();
         s3 = scanner.nextLine();
         String[] lines = new String[] {s1, s2, s3};
         for (int i = 0; i < lines.length; i++) {
             System.out.println(lines[i]);
         }
         for (int i = lines.length - 1; i >= 0; i--) {
             System.out.println(lines[i]);
         }

    }
}
