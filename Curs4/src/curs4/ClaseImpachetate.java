/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs4;

/**
 *
 * @author rmaftei
 */
public class ClaseImpachetate {

    public static void run() {
        
       
        
        
        System.out.println("*****Metode de instanta ale claselor de impachetare*****");
        Integer intObj1 = new Integer(25);
        Integer intObj2 = new Integer("25");
        Integer intObj3 = new Integer(35);
        //compareTo demo
        System.out.println("Comparing using compareTo Obj1 and Obj2: " + intObj1.compareTo(intObj2));
        System.out.println("Comparing using compareTo Obj1 and Obj3: " + intObj1.compareTo(intObj3));
        //Equals demo
        System.out.println("Comparing using equals Obj1 and Obj2: " + intObj1.equals(intObj2));
        System.out.println("Comparing using equals Obj1 and Obj3: " + intObj1.equals(intObj3));
        Float f1 = new Float("2.25f");
        Float f2 = new Float("20.43f");
        Float f3 = new Float(2.25f);
        System.out.println("Comparing using compare f1 and f2: " + Float.compare(f1, f2));
        System.out.println("Comparing using compare f1 and f3: " + Float.compare(f1, f3));
        //Addition of Integer with Float
        Float f = intObj1.floatValue() + f1;
        System.out.println("Addition of intObj1 and f1: " + intObj1 + "+" + f1 + "=" + f);
        
           System.out.println("************* Wrapper***********8");
           
        Boolean b = new Boolean(true);
        if (b == true) {
            System.out.println("Great");
        }

        Integer x = new Integer(1);
        int y = new Integer(2);
        x += y;
        System.out.println("x impachetat: " + x.toString());//toString intoarce un String reprezentand valoarea incapsulata

        int i = x.intValue();//intoarce valoarea incaprulata de wrapper object sub forma primitivei,poate fi si un fel de cast

        Integer intWrapper = Integer.valueOf("12345");
        //Converting from binary to decimal
        Integer intWrapper2 = Integer.valueOf("11011", 2);
        //Converting from hexadecimal to decimal
        Integer intWrapper3 = Integer.valueOf("D", 16);
        System.out.println("Value of intWrapper Object: " + intWrapper);
        System.out.println("Value of intWrapper2 Object: " + intWrapper2);
        System.out.println("Value of intWrapper3 Object: " + intWrapper3);
        System.out.println("Hex value of intWrapper: " + Integer.toHexString(intWrapper));
        System.out.println("Binary Value of intWrapper2: " + Integer.toBinaryString(intWrapper2));
        
        System.out.println("*********** finish Run*******8");
    }
// METODE STATICE ALE CLASELOR DE IMPACHETARE
    //OBT UNEI VAL DE TIP PRIMITIVA PE BAZA UNUI STRING CE CONTINE REPREZENTAREA TEXTUALA A VALORII
    //METODE DE PARSARE

    public static void run1() {
        System.out.println("Parse");
        Integer.parseInt("0", 10); // returns 0
        Integer.parseInt("473", 10);// returns 473
        Integer.parseInt("+42", 10);// returns 42
        Integer.parseInt("-0", 10); // returns 0
        Integer.parseInt("-FF", 16); // returns -255
        Integer.parseInt("1100110", 2); // returns 102
        Integer.parseInt("2147483647", 10); // returns 2147483647
        Integer.parseInt("-2147483648", 10); // returns -2147483648
        //Integer.parseInt("2147483648", 10); // throws a NumberFormatException
        //Integer.parseInt("99", 8); // throws a NumberFormatException
        //Integer.parseInt("Kona", 10); // throws a NumberFormatException
        Integer.parseInt("Kona", 27); // returns 411787

        System.out.println("*********** finish Run1 ************");

    }

    public static void runCharIsLetter() {
        System.out.println("**** runCharIsLetter **********");
        char ch1 = 'A';
        char ch2 = '5';

        boolean b1 = Character.isLetter(ch1);
        boolean b2 = Character.isLetter(ch2);

        System.out.println(ch1 + " is letter: " + b1);
        System.out.println(ch2 + " is letter: " + b2);

        System.out.println("\n+ is letter: " + Character.isLetter('+'));
        System.out.println("$ is digit: " + Character.isLetter('$'));


    }
    public static void runCharIsDigit(){
         System.out.println("*********** runCharIsDigit ********** ");
        char ch1 = '5';                            // observe, it is digit
    char ch2 = 'A';                            // observe, it is not digit, it is letter
 
     boolean b1 = Character.isDigit(ch1);
     boolean b2 = Character.isDigit(ch2);
 
     System.out.println(ch1 + " is digit: " + b1);     
     System.out.println(ch2 + " is digit: " + b2);     
 
     System.out.println("\n+ is digit: " + Character.isDigit('+'));       // observe, it is not digit, it is special character
     System.out.println("$ is digit: " + Character.isDigit('$'));         // observe, it is not digit, it is special character
    }
    
    public static void runCharIsUpper(){
         System.out.println("*********** runCharIsUpper ********** ");
        char ch1 = 'A';
    char ch2 = 'a';
 
    boolean b1 = Character.isUpperCase(ch1);
    boolean b2 = Character.isUpperCase(ch2);
 
    System.out.println(ch1 + " character is uppercase letter: " + b1);     
    System.out.println(ch2 + " character is uppercase letter: " + b2);   
 
        // the isUpperCase() method can be used in control structures like this
    if(Character.isUpperCase('B') ==  Character.isUpperCase('K'))
    {
      System.out.println("\nBoth B and K are uppercase letters");
    }
        // after checking, change the case
    if(! Character.isUpperCase('b'))
    {
      System.out.println("\nb is converted to uppercase letter: " + Character.toUpperCase('b'));
    }
    }
    public static void runCharToUpper(){
         System.out.println("*********** runCharToUpper ********** ");
        char ch1 = 'a';
   char ch2 = '5';                            // observe, it is digit
 
   char ch3 = Character.toUpperCase(ch1);
   char ch4 = Character.toUpperCase(ch2);
 
   System.out.println(ch1 + " is converted to " + ch3);     
   System.out.println(ch2 + " digit is converted to " + ch4);   
 
   System.out.println("\nch3 is uppercase letter: " + Character.isUpperCase(ch3));
   System.out.println("ch4 is uppercase letter: " + Character.isUpperCase(ch4));
    }
}
