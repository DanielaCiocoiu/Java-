package exersare;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;
import java.util.Random;

public class Ex2 {

    public static void display(int x[][]) {
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "\t");
            }
            System.out.println("");
        }
    }

    public static void paramArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            a[i] += 10;
        }
    }

    public static void randomNumber() {
        Random ran = new Random();
        int number;
        for (int i = 0; i < 100; i++) {
            number = ran.nextInt(6) + 1;//de la 1 la 6, daca vreau de la 0, scot +1
            System.out.println(number);
        }
    }

    public static void ifff() {
        Scanner out = new Scanner(System.in);
        int numar = out.nextInt();
        switch (numar) {
            case 2:
            case 4:
                System.out.println("Numarul este par");
                break;

            case 5:
                System.out.println("Numarul este prim");
            case 1:
            case 3:
                System.out.println("Numarul este impar");
                break;
            default:
                System.out.println("default");
                ;
        }

    }

    public static void Arr() {
        // initializing unsorted int array

        int jArr[] = {2, 1, 9, 6};
        // sorting array
        Arrays.sort(jArr);
        // let us print all the elements available in list
        for (int number : jArr) {
            System.out.println("Number sort = " + number);

        }
        System.out.println("Number toString= " + Arrays.toString(jArr));
        System.out.println("Number copy = " + Arrays.copyOf(jArr, 9));
        System.out.println("Number equals= " + Arrays.equals(jArr, jArr));

    }

    //. Write a Java program to find the number of days in a month
    public static void NumarZile() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti luna: ");
        int luna = in.nextInt();
        System.out.println("Introduceti anul: ");
        int an = in.nextInt();
        if (luna == 2) {
            if (an % 4 == 0 && an % 100 == 0 && an % 400 == 0) {
                System.out.println("29");
            } else {
                System.out.println("28");
            }
        } else {
            System.out.println((28 + (luna + Math.floor(luna / 8)) % 2 + 2 % luna + 2 * Math.floor(1 / luna)));
        }
    }
//System.out.println("luna = " + luna + "anul are" +an+  zile + "zile");

//dacă (year nu este divizibil cu 4) atunci (an obișnuit)
//altfel dacă (year nu este divizibil cu 100) atunci (an bisect)
//altfel dacă (year nu este divizibil cu 400) atunci (an obișnuit)
//altfel (an bisect)
//+++++++++++++++++++++++++++++++++++
// Write a Java program that takes the user to provide a single character from the alphabet. 
// Print Vowel of Consonant, depending on the user input. If the user input is not a letter 
//  (between a and z or A and Z), or is a string of length > 1,print an error message.  
    public static void Character() {
        Scanner in = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1) {
            System.out.println("Error. Not a single character.");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        } else if (vowels) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }

    public static void AnBisect() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti anul: ");
        int an = in.nextInt();
        if (an % 4 == 0 || an % 100 != 0 && an % 400 == 0) {
            System.out.println("bisect");
        } else {
            System.out.println("nu este bisect");
        }

    }

    //Write a program in Java to display n terms of natural numbers and their sum    
    public static void NatNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numerul: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
            sum = i + i;

        }

        System.out.println("sum Suma numereler pana la n:  " + sum);

    }
    //sum and average 

    public static void SumaSiMedie() {
        int n = 0, sum = 0;
        double average;
        {
            System.out.println("Introduceti numerul: ");
        }
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            n = in.nextInt();
            sum += n;
        }
        average = sum / 5;
        System.out.println("The sum of 5 no is : " + sum + "\nThe Average is : " + average);
    }

    public static void sortArray() {
        int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013,
            1458, 2458, 1254, 1472, 2365,
            1456, 2165, 1457, 2456};

        String[] my_array2 = {
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };

        System.out.println("Original numeric array is: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array is: " + Arrays.toString(my_array1));
        System.out.println("Original string array is: " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array is: " + Arrays.toString(my_array2));

    }

    public static void sumArray() {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : my_array) {
            sum += i;

            System.out.println("sum = " + sum);
        }

    }

    public static void grid() {
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d", a[i][j]);
            }
            System.out.println();
        }

    }

}
