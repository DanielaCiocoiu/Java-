
package curs4;


public class ExStatic {
    
    //cba
    int x = f();
    static int y = g();
    
    public ExStatic(){
        System.out.println("A");
    }
    int f(){
        System.out.print("B");
        return 0;
    }
    static int g(){
        System.out.print("C");
        return 1;
    }
       
//    int a;
//    static int b;
//    static void a(){
//        
//    }
//    static {//bloc de initializare static
//        System.out.println("S-a incarcat clasa BlocInitializare!");
//        //a =15; - eroare, din bloc static nu pot accesa membri de instanta
//        a();// 
//        b = 16;//campul static trebuie declarat in prealabil
//        
//    }
//    
//    public int number = 5;
//    public static int x = f();
//    static {
//        System.out.println("x="+x);//0
//        //System.out.println(y);//eroare
//        System.out.println(f());//0
//    }
//    static int f(){
//        System.out.println("f()");
//        return y;
//    }
//    static int y = 6;
//    static {
//        System.out.println(6);//6
//        
//        System.out.println("Finish static ************");
    }

