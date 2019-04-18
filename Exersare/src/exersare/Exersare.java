package exersare;

import static exersare.Ex3.abc;
import static java.lang.Double.sum;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class Exersare {

    public static void main(String[] args) {

       Scanner input=new Scanner(System.in);
     int in=input.nextInt();
     while(in>0){
         
     int intt=input.nextInt();
     String str=input.next();
     float fl=input.nextFloat();     
     System.out.println( intt+" "+str+" "+fl);
     in--;  
        }
//1 gfg 2,4
//18 geeksforgeeks 9,88
//		int seconds = 86338; 
//        int p1 = seconds % 60;
//        int p2 = seconds / 60;
//        int p3 = p2 % 60;
//        p2 = p2 / 60;
//        System.out.print( p2 + ":" + p3 + ":" + p1);
//		System.out.print("\n");
        //---------------------------------- 
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number : ");
//        int x = in.nextInt();
//        System.out.print("Input the second number: ");
//        int y = in.nextInt();
//        System.out.print("Input the third number : ");
//        int z = in.nextInt();
//        System.out.print("The result is: " + abc(x, y, z, true));
//        System.out.print("\n");
        //-----------------------------
        //Ex3.inputString();
        //Ex3.dividedNo();
        //Ex3.primNo();
        // System.out.format("\n Current Date Time: %tc%n\n", System.currentTimeMillis());
        //--------------------------------------------
//        int n;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input number: ");
//        n = in.nextInt();
//        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
        //--------------------------------------------
        //Ex3.password();
        // Ex3.charPrint();
        //--------------------------------------------
        //Ex3.uniqueDigit();
        //------------------------------
//        String test = "The quick brown foxAa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
//        Ex3.countLetter(test);
        //----------------------------
        //Ex3.reversedWord();
        //--------------------------------------------       
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a string: ");
//        String str = in.nextLine(); 
//----------------------------------------------------       
//         Scanner in = new Scanner(System.in);
//        System.out.print("Input a string: ");
//        String str = in.nextLine();
//         System.out.println("The middle character in the string: " + Ex3.middle(str) + "\n");
        //---------------------------------------------------       
        //Ex3.piramid1();
        //Ex3.prim();
        //Ex3.fibonacci();
        // Ex3.factorial();
        // Ex3.reverseNum();
        //----------------------------------------------------       
//Pornind de la experienta acumulata la exercitiul anterior, implementeaza o metoda (i.e. isPalindromIgnoreCasePRO(String)) care determina daca 
//o propozitie este palindrom, ignorand diferentele de litere mari / mici si toate caracterele care nu sunt litere. Similar exercitiului 
// precedent, metoda va returna true daca sirul de caractere este palindrom sau false in caz contrar.
//     // Test 1
//    System.out.println("Test 1: " + Ex3.isPalindromIgnoreCasePRO(""));
// 
//    // Test 2
//    System.out.println("Test 2: " + Ex3.isPalindromIgnoreCasePRO("Red rum, sir, is murder!"));
// 
//    // Test 3
//    System.out.println("Test 3: " + Ex3.isPalindromIgnoreCasePRO("Was it a cat I saw?"));
// 
//    // Test 4
//    System.out.println("Test 4: " + Ex3.isPalindromIgnoreCasePRO("Not a palindrom, I'm afraid.."));
// 
//    // Test 5
//    System.out.println("Test 5: " + Ex3.isPalindromIgnoreCasePRO("Step on no pets."));    
//        
//------------------------------------------------        
// // Test 1
//    System.out.println("Test 1: " + Ex3.isPalindromIgnoreCase(""));
// 
//    // Test 2
//    System.out.println("Test 2: " + Ex3.isPalindromIgnoreCase("dog"));
// 
//    // Test 3
//    System.out.println("Test 3: " + Ex3.isPalindromIgnoreCase("MadAM"));
// 
//    // Test 4
//    System.out.println("Test 4: " + Ex3.isPalindromIgnoreCase("Rotator"));
//---------------------------------------------------------------------
        //Implementeaza o metoda (i.e. countOccurrencesIgnoreCase(String[] array, String key)) care determina numarul de elemente key din cadrul 
        //array si returneaza aceasta valoare. Metoda nu tine cont de tipul literelor (i.e. majuscule vs. minuscule). 
//Testeaza metoda in main pentru cat mai multe cazuri de exceptie.     
        // Test 1
//    String[] array1 = {};
//    String key1 = "aKey";
//    System.out.println("Test 1: " + Ex3.countOccurrencesIgnoreCase(array1, key1));
// 
//    // Test 2
//    String[] array2 = {"Java", "C", "Python", "JAVA", "perl", "C#", "java"};
//    String key2 = "JAVA";
//    System.out.println("Test 2: " + Ex3.countOccurrencesIgnoreCase(array2, key2));
// 
//    // Test 3
//    String key3 = "JA VA";
//    System.out.println("Test 3: " + Ex3.countOccurrencesIgnoreCase(array2, key3));
// 
// 
//    // Test 4
//    String key4 = "TensorFlow";
//    System.out.println("Test 4: " + Ex3.countOccurrencesIgnoreCase(array2, key4));
//------------------------------------------------------
        //Ex3.divisors();
        //Ex3.displayReverseAndSum(21_304);
        //Ex3.micMareMedie();
// System.out.println(Ex3.isPrime(7));
//-------------------------------------------------------
        //Scrie un algoritm care citeste de la tastatura un numar n si afiseza toate numerele prime pana la n (inclusiv), incepand cu 2.
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 2; i <= n; i++) {
//            if (Ex3.isPrime(i)) {
//                System.out.print(i + "Este numar prim");
//            }
//        }
//        System.out.println();
//    }
//}
//       int [][] s = {{2, 1, 9, 6, 4},{2, 1, 9, 6},{2, 1, 9, 6}};
//        for (int i = 0; i < s.length; i++) {
//            for (int j = 0; s[i].length < 10; j++) {
//                
//                 System.out.println(s[i][j]);
//            }
//        }
//      char [] t = {'a','b','c','d','e'};
//      
//        System.out.println(Arrays.copyOfRange(t, 1, 3));
//        Arrays.extend();
//---------------------------------------
//        int[] lemon = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        
//        for (int y : lemon) {
//            System.out.println(y);
//        }
//        Ex2.paramArray(lemon);
//-------------------------------
//Ex2.randomNumber();
//Ex2.Arr();
//Ex2.ifff();
//Ex2.grid();
//Ex2.sumArray();
//Ex2.sortArray();
//Ex2.NatNumber();
//Ex2.AnBisect();
//Ex2.NumarZile();
//Ex2.Character();
//------------------------------------Ex1-------------------------------------------
//sumdigit **************
//System.out.println("Suma cifrelor este: " + Ex1.SumDigit(4567));
//hexagon aria **************
//System.out.println("Aria hexagonului este: " + Ex1.hexagonArea(8));
//reverse string **************
//        System.out.print("Imput a string: ");
//        char[] propozitie = input.nextLine().toCharArray();
//        for (int i = propozitie.length -1; i > 0; i--) {
//            System.out.print(propozitie[i]);
//        }
//          System.out.print(" \n ");      
//    }
//String text = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
//Ex1.count(text);
//Ex1.uniqueDigit();
//Ex1.chraSet();
//Ex1.chraNumber();
//Ex1.FizzBuzz();
//Ex1.sortedArray();
//Ex1.radical();
//Ex1.Palindrom(); ??????????????
//Ex1.Fahrenheit();
//Ex1.inchConvert();
//Ex1.yearsDays();
//Ex1.currentTime();
    }
}
