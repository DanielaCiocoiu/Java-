package exersare;

import java.io.Console;
import java.util.Scanner;

public class Ex3 {

    public static void displayReverseAndSum(int x) {
        System.out.print("Cifrele numarului sunt: ");

        //n == 21_304;
        int sum = 0;

        while (x > 0) {

            int reverse = x % 10;
            System.out.print(reverse + ", ");
            sum = sum + x % 10;
            x = x / 10;

        }
        System.out.println();
        System.out.println("Suma cifrelor este: " + sum);
    }

    public static void micMareMedie() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n==7
        int crtNumber = sc.nextInt();//1 15 0 21 14 101 1
        int minValue = crtNumber;
        int maxValue = crtNumber;
        double mean = crtNumber;// media aritmetica

        for (int i = 1; i < n; i++) {
            crtNumber = sc.nextInt();
            mean += crtNumber;// suma 
            if (minValue > crtNumber) {
                minValue = crtNumber;
            }
            if (maxValue < crtNumber) {
                maxValue = crtNumber;
            }
        }
1 gfg 2,4
18 geeksforgeeks 9,88
        mean /= n;

        System.out.println("Numarul minim: " + minValue);
        System.out.println("Numarul maxim: " + maxValue);
        System.out.println("Media aritmetica: " + mean);
    }

    // Scrie o metoda care sa determine daca un numar dat este numar prim. 
    //Metoda va returna true daca numarul este numar prim si false in caz contrar.
//Scrie o metoda care sa determine daca un numar dat este numar prim. 
    //Metoda va returna true daca numarul este numar prim si false in caz contrar.
    //2, 3, 5, 7, 11, 13, 17, 
    public static boolean isPrime(int number) {
        if (number < 2) { //trebuie sa fie mai mic decat 2
            return false;
        }

        for (int i = 2; i <= number / 2; i++) { //mai mic decat nr / 2
            if (number % i == 0) { //daca restul impartirii numarului la i este 0
                return false;
            }
        }
        return true;
    }

    //Implementeaza un program care afiseaza toti divizorii proprii (adica toti divizorii fara 1 si numarul insusi) ai unui numar natural
    //n citit de la tastatura. In cazul in care numarul este prim (i.e. nu are divizori proprii), programul va afisa mesajul 
    //Este numar prim. Cateva exemple sunt:  
    public static void divisors() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean hasDivisors = false;

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                hasDivisors = true;
                System.out.println(i + " ");
            }
        }

        if (hasDivisors = false) {
            System.out.println("Numar prim");
        }
        System.out.println();
    }

    public static int countOccurrencesIgnoreCase(String[] array, String key) {//primesc ca parametru un array si o cheie string
        int counter = 0; //urmeza sa adun

        for (int i = 0; i < array.length; i++) {//filtrez 
            if (array[i].equalsIgnoreCase(key)) {//verifi daca array-ul contine key
                counter++;
            }
        }

        return counter;
    }

    public static boolean isPalindromIgnoreCase(String word) {
        String lowerCaseWord = word.toLowerCase(); //ignor majuscule

        // reverse the string using the StringBuilder class
        StringBuilder sb = new StringBuilder(lowerCaseWord);
        String reverseLowerCaseWord = sb.reverse().toString();

        if (lowerCaseWord.equals(reverseLowerCaseWord)) {
            return true;
        }
        return false;
    }

    public static boolean isPalindromIgnoreCasePRO(String sentence) {
        String lowerCaseSentence = sentence.toLowerCase();

        // filter sentence for non-letters characters using the StringBuilder class
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lowerCaseSentence.length(); i++) {
            if (Character.isLetter(lowerCaseSentence.charAt(i))) {
                sb.append(lowerCaseSentence.charAt(i));
            }
        }

        String onlyLettersSentence = sb.toString();
        String onlyLettersSentenceReverse = sb.reverse().toString();
        if (onlyLettersSentence.equals(onlyLettersSentenceReverse)) {
            return true;
        }
        return false;
    }

    public static void reverseNum() {

//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
        int num = 1225;
        int m = num; // pt a compara num cu reverse, memorez intr-o alta variabila
        int reverse = 0;
        while (num > 0) {
            reverse = (reverse * 10) + (num % 10);
            num /= 10;

        }
        System.out.println("reversed number: " + reverse);
        if (reverse == m) {
            System.out.println(reverse + " is palindrome");
        } else {
            System.out.println(reverse + " is not palindrome");
        }

    }

    public static void factorial() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
            System.out.println("factorial: " + fact);
        }
        System.out.println();
    }

    public static void fibonacci() {
        int fibonacci = 10;
        int first;
        int second = 0;
        int third = 1;

        for (int i = 1; i <= fibonacci; i++) {

            first = second;
            second = third;
            third = first + second;

            System.out.println("fibonacci is: " + second);
        }
        System.out.println();

    }

    public static void prim() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num % 2 != 0) {
            System.out.println("is prim");
        } else {
            System.out.println("no");
        }
    }

    public static void piramid1() {
        int num = 5;
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  " + num);
            }
            System.out.println(" ");
        }

    }

    public static String middle(String str) {

        int pozition;
        int length;

        if (str.length() % 2 == 0) {
            pozition = str.length() / 2 - 1;
            length = 2;
        } else {
            pozition = str.length() / 2;
            length = 1;

        }
        return str.substring(pozition, pozition + length);

    }

    public static void reversedWord() {
        //The quick brown fox
        Scanner in = new Scanner(System.in);
        char[] str = in.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = str.length - 1; i >= 0; i--) {

            System.out.print(str[i]);

        }

        System.out.print("\n");

    }

    public static void countLetter(String x) {

        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }

    public static void uniqueDigit() {
        int sum = 0;
        int j;
        for (int i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        sum++;
                        System.out.println(i + " " + j + " " + k);
                    }

                }

            }
            System.out.println("Total number of the three-digit-number is " + sum);
        }

    }

    public static void charPrint() {

        int chr = 'Z';
        System.out.println("The ASCII value of Z is :" + chr);
    }

    public static void password() {
        Console cons;
        if ((cons = System.console()) != null) {
            char[] pass_ward = null;
            try {
                pass_ward = cons.readPassword("Input your Password:");
                System.out.println("Your password was: " + new String(pass_ward));
            } finally {
                if (pass_ward != null) {
                    java.util.Arrays.fill(pass_ward, ' ');
                }
            }
        } else {
            throw new RuntimeException("Can't get password...No console");
        }
    }

    public static void primNo() {
        int no = 99;
        for (int i = 1; i <= 99; i++) {
            if (no % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void dividedNo() {
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n\nDivided by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
    }

 public static void inputString() {
 Scanner in = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String str1 = in.nextLine();
		int result = Integer.parseInt(str1);
        System.out.printf("The integer value is: %d",result);
		System.out.printf("\n");
    }

 
    
    public static boolean abc(int p, int q, int r, boolean xyz){	
         
        
        
          if(xyz)
		  return (r > q);
          
	   return (q > p && r > q);
           
           
           
   
}
}


 
 
