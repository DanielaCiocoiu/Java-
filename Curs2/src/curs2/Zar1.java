package curs2;


public class Zar1 {
   public static void afisareZar(int z) {
        switch (z) {
            case 1:
                System.out.println("One");
                System.out.println("   ");
                System.out.println(" * ");
                System.out.println("   ");
                break;
            case 2:
                System.out.println("Two");
                System.out.println("*  ");
                System.out.println("   ");
                System.out.println("  *");
                break;
            case 3:
                System.out.println("Three");
                System.out.println("*  ");
                System.out.println(" * ");
                System.out.println("  *");
                break;
            case 4:
                System.out.println("Four");
                System.out.println("* *");
                System.out.println("   ");
                System.out.println("* *");
                break;
            case 5:
                System.out.println("Five");
                System.out.println("* *");
                System.out.println(" * ");
                System.out.println("* *");
                break;
            case 6:
                System.out.println("Six");
                System.out.println("* *");
                System.out.println("* *");
                System.out.println("* *");
                break;
        }
    }
    public static void afiseazaZarCuArray(int z){
        
        System.out.println(new String []{"Unu", "Doi", "Trei", "Patru","Cinci", "Sase"});
    }
}  

