
package curs4;


public class ExString {
    
    public static void runString(){
        System.out.println("-----ExString-------");
         String s = new String("Infoacademy");
         int i = s.length(); System.out.println(i);
         
         char c = s.charAt(2); System.out.println(c);
         
         int i1=s.compareTo("abc"); System.out.println(i1);
         String s1 = s.toLowerCase(); System.out.println(s1);
         String s2 = s.toUpperCase(); System.out.println(s2);
         String s3 = "0123456789"; 
         String s4 = s.substring(4,8); System.out.println(s4);
         String s5 = s.concat("rules");System.out.println(s5);
         int primaChar = s.indexOf('a'); System.out.println(primaChar);
         
         int primaSir = s.indexOf("cad"); System.out.println(primaSir);
         
         
         
         
         System.out.println("-------finish String------");
    }
  
    
    
}
