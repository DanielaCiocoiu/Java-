/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs4;

import java.util.Scanner;

/**
 *
 * @author rmaftei
 */
public class ExMathAndScanner {
    
    public static void runMathAndScanner(){
        System.out.println("*********MathAndScanner**********");
          System.out.println(Math.abs(5));
        System.out.println(Math.pow(2, 8));

        System.out.println(Math.max(2, 8));
        System.out.println(Math.random());
        System.out.println(Math.signum(8));//determina semnul unui numar
        System.out.println(Math.sqrt(2.8));//extrage radacina patrata
        System.out.println(Math.floor(2.8));//produce intregul imediat inferior
        System.out.println(Math.ceil(2.8));//produce intregul imediat superior
        System.out.println(Math.round(2.8));//produce cel mai apropiat numar intreg

        String s = "mere pere prune";
        Scanner sc = new Scanner(s);
        System.out.println(s);
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.next());

        String s1 = "Am 5 mere";
        Scanner sc1 = new Scanner(s1);
        System.out.println(sc1.next());//intoarce urmatorul camp
        System.out.println(sc1.nextInt());//intoarce urmatoarea linie din camp

        //Scanner sc2 = new Scanner(System.in);
        //System.out.println("Introduceti textul: ");
        //String text = sc2.nextLine();

//        System.out.println(sc2.next());//mambo
//        System.out.println(sc2.next());//number
//        System.out.println(sc2.nextInt());// 5 fara a mai cere input
//        System.out.println("Finish ExMathAndScanner");
    }
            
    
}
