package exersare;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

public class Ex1 {

        
    
    

    public static int SumDigit(int a) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum = sum + a % 10;
            a = a / 10;
        }
        return sum;
    }

    public static double hexagonArea(double b) {
        double hexa =  (6 * (b * b)) / (4 * Math.tan(Math.PI / 6));
        return hexa;
    }
//Write a Java program to count the letters, spaces, numbers and other characters of an input string**************

    public static void count(String x) {
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else {
                other++;
            }
        }
        System.out.println("\"The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33\"");
        System.out.println("letter" + letter);
        System.out.println("space" + space);
        System.out.println("num" + num);
        System.out.println("other" + other);
    }
//Write a Java program to create and display unique three-digit number using 1, 2, 3, 4.*********
// Also count how many three-digit numbers are there

    public static void uniqueDigit() {
        int amount = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        amount++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }

            }

        }
        System.out.println("Numarul total de cifre este: " + amount);

    }
//Write a Java program to list the available character sets in charset objects.************    

    public static void chraSet() {
        System.out.println("List of available character sets: ");
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }

    }
//Write a Java program to print the ascii value of a given character.*************  

    public static void chraNumber() {
        int chr = 'z';
        System.out.println("The ASCII value of Z is:" + chr);

    }
    //Write a Java program which iterates the integers from 1 to 100. 
    //For multiples of three print "Fizz" instead of the number and print "Buzz" for the multiples of five.
    //When number is divided by both three and five, print "fizz buzz".

    public static void FizzBuzz() {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }

    }//Write a Java program to merge two given sorted array of integers and create a new sorted array.

    public static void sortedArray() {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 5, 7, 8};
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < result.length; i++) {//populez
            if (i < 4) {
                result[i] = arr1[i];
            } else {
                result[i] = arr2[i - 4];
            }
        }
//Sort Arrray
        for (int k = 0; k < result.length; k++) {
            for (int j = 1; j < result.length - 1; j++) {
                int temp = 0;
                if (result[j - 1] > result[j]) {
                    temp = result[j - 1];
                    result[j - 1] = result[j];
                    result[j] = temp;
                }
            }

        }
        for (int j = 0; j < result.length; j++) {
            System.out.print(" " + (result[j]));
        }
    }

    public static void radical() {
        double a = 25;
        double result = Math.sqrt(a);
        System.out.println(result);
    }
    
//    public static void Palindrom(){
//        int pal = 121;
//        int a;
//        for (int i = 0; i < pal; i++) {
//            if (a == pal) {
//                System.out.println("Numarul este palindrom: " + a);
//            }
//            else{
//                System.out.println("Numarul nu este palindrom");
//            }
//            a = pal % 10;
//            a += a;
//            pal = pal / 10;
//
//            System.out.println(a);
//        }
//    }
    
//Write a Java program to convert temperature from Fahrenheit to Celsius degree.
    public static void Fahrenheit(){
        Scanner input = new Scanner(System.in);
       System.out.println("Introduceti gradele Fahrenheit: ");
        double  fahrenheit = input.nextDouble();
        //double f = (9c+(32*5))/5;
        double celsius = ((5 * (fahrenheit-32.0))/9.0);
         System.out.println( fahrenheit + " degree Fahrenheit is equal to" + celsius + " in Celsius");
    }
    
    public static void inchConvert() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti inches: ");
        double inches = input.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(inches + " inches este egal cu: " + meters + " de metri");
    }
    public static void yearsDays(){
        Scanner aici = new Scanner(System.in);
        System.out.println("Introduceti minutele: ");
        double minute = aici.nextDouble();
       double minuteInAn = 60*24*360;
       long ani = (long) (minute/minuteInAn);
       int zile = (int) (minute / 60 / 24) % 365;
       
       System.out.println(minute + "de minute inseamna " + ani + "ani si " + "zile" + zile );
       
      
    }
    //Write a Java program that prints the current time in GMT.
    public static void currentTime(){
          
        long timeZoneChange = 256;

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = ((totalHours + timeZoneChange) % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }

  

    
    
    
    
    
}