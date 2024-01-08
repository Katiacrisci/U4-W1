package app;

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
}
