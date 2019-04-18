package curs4;

import curs4.DemoEnum.CertificareJava;
import java.util.Scanner;

public class Curs4 {

    public static void main(String[] args) {
        Finals a = new Finals();
        a.fin();
        int i = 8;
        Integer x = i;
        System.out.println(i);
        
        String s = "15.2";
        double d = Double.parseDouble(s);
        System.out.println(d);
        
        Integer j     = new Integer(9);
        String g = j.toString(j);
        System.out.println(j);
        
        
//        String s = i.toString();
//        int x = i;
        
//        System.out.println(s);
//        System.out.println(x);
       
        new ExStatic();
        
     
        
   
        
        String v = "one two three";
        System.out.println(v.substring(4, 6));
 
Scanner sc = new Scanner(v);
sc.next();
System.out.println(sc.next());
 
String[] ss = v.split(" ");
System.out.println(ss[1]);
 
System.out.println(v.substring(v.indexOf(" ")+1, v.lastIndexOf(" ")));
 
System.out.println(v.replace("one ", "").replace(" three",""));
        
        System.out.println("------------abra---------------");     
        String y = "Abracadabra";
System.out.println(y.substring(0,5).replace('a', 'o').lastIndexOf('a'));
       

String s1 = "ABC";
String s2 = new String("ABC");

if(s1 == s2){
	System.out.print("A");
}
if(s1.equals(s2)){
	System.out.print("B");
}
if(s1.compareTo(s2)==0){
	System.out.println("C");
}


//ExStatic.new Test();
        
  ExString.runString();
        ClaseImpachetate.run();
        ClaseImpachetate.run1();

        ClaseImpachetate.runCharIsLetter();
        ClaseImpachetate.runCharIsDigit();
        ClaseImpachetate.runCharIsUpper();

        ExMathAndScanner.runMathAndScanner();
      
        DemoEnum.runEnum();
        //ExStatic.f();

    }

}
