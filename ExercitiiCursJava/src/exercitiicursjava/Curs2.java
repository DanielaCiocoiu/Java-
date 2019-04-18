
package exercitiicursjava;

  import java.util.Arrays;
import java.lang.reflect.Array;
public class Curs2 {
  
//   int [][]s = {{13,22,116},{34,105,21},{131,23,84,263,65},{1,2,3,4}};
//   int [][]a = new int [4][];
//    a[0]= new int[4];
//    a[1]= new int[3];
//    a[2]= new int[5];
//    a[3]= new int[4];
    
     public static void printUniArray(int[] item) {
           System.out.println("Unidimensional: ");
        for (int i = 0; i < item.length; i++) {  

            System.out.print(item[i] + " ");
        }
        System.out.println(  );
        System.out.println(  );
    }
    public static void printBidiArray(int[][] item) {
        System.out.println("Bidimensional: ");
        
        for (int i = 0; i < item.length; i++) {  // trece prin fiecare rand
            for (int j = 0; j < item[1].length; j++) { //trece prin fiecare array de pe rand

                System.out.print(item[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printMultiArray(int[][][] item) {
         System.out.println("Tridimensional: ");
         
        for (int i = 0; i < item.length; i++) {  // trece prin fiecare rand
            for (int j = 0; j < item[1].length; j++) { //trece prin fiecare array de pe rand
                for (int k = 0; k < item[2].length; k++) {//trece prin fiecare element
                    System.out.print( +item[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println(" ");
        }
    }

}
