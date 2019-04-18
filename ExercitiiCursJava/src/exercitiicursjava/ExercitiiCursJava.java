package exercitiicursjava;

import static java.lang.Double.sum;
import java.util.Scanner;
import java.util.Arrays;

public class ExercitiiCursJava {

    public static void main(String[] args) {

//        int[] a;
//
//        int[][] b;
//
//        int[][][] c;
//        // b = a;//nu
//        //b = c;//nu
//        b[0] = a;
//        c[0] = b;
//        c[0][1] = a;
//        b = c[2];
//        //c[1][2] = b; //nu
//        c[2][0][1] = a[0];

 int intArray[]= new int[5];
 char charArray[]=new char [4];
 double dblArray[]=new double[7];
        for (int i = 1; i < intArray.length; ++i) {
            for (int j = 1; j < dblArray.length; ++j) {
                dblArray[j] = i*j; //4*6
            }
        }
        for (int k = 1; k < dblArray.length; ++k) {
            System.out.println(dblArray[k]+","); //
        }
//---------------------------        
//  char chArray[]={'H', '0', 'A','5', '3'};      
//     System.out.println(chArray[3]);    
//-----------------------------------
//        int intArray[] = {0, 4, 2, 5, 3};
//        char chArray[] = {'H', 'B', 'R', '2'};
//        double dbArray[] = {3.4, 4.5, 2.0, 5.3, 3.1, 8.2, 9.0};
////System.out.println("The output is:" + dbArray[intArray[2]]+ intArray[chArray[3]]);//ArrayIndexOutOfBoundsException
//        System.out.println(dbArray[intArray[1]]);//merge in int, il ia pe 4 si cauta elementul de la indexul 4
//        System.out.println(Arrays.toString(dbArray));
////System.out.println(intArray[chArray[3]]);////ArrayIndexOutOfBound

//------------------------------------------------
//      char[] t = {'a','b','c','d','e'};  
//       char[] t2 = Arrays.copyOfRange(t,1,3);
//        System.out.println(Arrays.toString(t2));
//        
        //----------------------- 
//     double arrayy[] = {7.7, 3.0,4.0,2.0, 3.0,2.2,2.2};  
//        System.out.println(arrayy.length);
//        
        //------------------
//     int []a = new int [5];
//       int []b = new int [4];
//       int []c = new int [7];
//        
//        for (int i = 1; i < i.length; ++i) {
//            
//        }
        //---------------------------------------------     
//        int a = 6;
//int b = 9;
//int c = 7;
//if(a-c<0){
//	if(b-c>0) System.out.println("I love Java");
//	else System.out.println("I love C++ more");
//}else{
//	 System.out.println("...but there's always PHP...");
//}
//-----------------------------------
//        int number[];
//        number = new int[2];
//
//        System.out.println(Arrays.toString(number));
//-----------------------------   
//----------------------------------------
//int i = 2;
//
//do{
//	i+=i;
//        System.out.println(i+ " valoare");
//}while (i<10);
//        
//----------------------------
//int[] a = {8, 9, 10, 11};
//
//        int[][] b = {
//            {1,2,3,4},
//            {5,6,7,8},
//            {9,10,11,12,13},
//            {14,15,16,17 }};
//    
//        int[][][] c = {
//            {
//                {1, 1, 1}, {2, 2, 2}, {3, 3, 3},},
//            {
//                {4, 4, 4}, {5, 5, 5}, {0, 0, 0}
//            },
//            {
//                {6, 6, 6}, {7, 7, 7}, {9, 9, 9}
//            },
//            {
//                {8, 8, 8}, {10, 10, 10}, {11, 11, 11}
//            }
//        };
//
//        System.out.println("b[0]: " + Arrays.toString(b[0]));
//        System.out.println("c[0]: " + Arrays.deepToString(c[0]));
//        System.out.println("c[0][1]: " + Arrays.toString(c[0][1]));
//        System.out.println("c[2]: " + Arrays.deepToString(c[2]));
//        System.out.println("c[1][2]: " + Arrays.toString(c[1][2]));
//        System.out.println("c[2][0][1]: ");
//        for (int i = 0; i < c.length; i++) {
//            System.out.print(c[2][0][1] + ",");
//
//        }
//        System.out.println(" ");
//        System.out.println("a: " + Arrays.toString(a));
//
//        Curs2.printUniArray(a);
//
//        Curs2.printBidiArray(b);
//
//        Curs2.printMultiArray(c);
//
//        System.out.println(b.length);
//------------------------------
//double list[3] = { 5.2, 7.0, -2.5 };
// double[] list1 = [ 5.2, 7.0, -2.5];
// double[] list2 = { 5.2, 7.0, -2.5 };
// double[] list3 = array(5.2,7.0,-2.5);
//--------------------------------
//int x = 2;
//int y = 2;
//int z = (((x++) + (++y)) > 5 && ((++x)+y)<10)?1:0;
//System.out.println(x);
//System.out.println(y);
//System.out.println(z);
//-------------------------------
//        int i = 0;
//        System.out.println("Valorile lui i sunt: ");
//
//        while (i < 13) {
//            i += 3;
//
//            System.out.println(i + " ");
//        }
//-------------------------------------------
//        System.out.println("Valorile lui j sunt: ");
//        for (int j = 0; j < 5; j++) {
//            System.out.println(j);
//            if (j == 1) continue;
//            
//            if (j == 2) break;
//        }
//------------------------------------------
//        System.out.println("");
//        for (int i = 0; i < 4; i++) {
//            for (int j = 1; j < 4; j++) {
//                if(j==2 &&i==1)continue;//executia sare la sfarsitul primului for
//                System.out.println("i= "+i+", j= "+j);
//            }
//---------------------------------------------
//               int[] a = {3,1,7};
//               
//             int[][] b = {{1,5},
//                         {6},
//                         {3,0}};
//
//           int[][][] c = {
//                        {{1,2},{8}},
//                        {{4}},
//                        null,
//                        {{5,6},null}};
//
//        System.out.println("b[1]= " + Arrays.toString(b[1])); // 6
//         System.out.println("b[2]= " + Arrays.toString(b[2]));// 3,0
//        System.out.println("c[0] [0]= " + Arrays.toString(c[0][0]));// 1,2
//        System.out.println("c[0][a[1]]= " + Arrays.toString(c[0][a[1]])); // 3
//        System.out.println("c[2]= " + Arrays.toString(c[2])); //null
//       //System.out.println("c[2][1]: " + Arrays.toString(c[2][1]));
//            
//        System.out.println(" ");
//        System.out.println("a= " + Arrays.toString(a));
//        System.out.println("b= " + Arrays.deepToString(b));
//        System.out.println(b.length);
//        //Curs2.printUniArray(a);
//       // Curs2.printBidiArray(b);
//        //Curs2.printMultiArray(c);
//for (int i = 0; i < b.length; i++) {
//    System.out.println("********");
//            System.out.println((Arrays.toString(b[c.length/2])) + "  ");
//        }
//        b[1] = a; //da
////       c[0][0] = a[1];//nu
////        b[1] = a[2];//nu
//        c[2] = b;
//        c[0][a[1]] = b[c.length/2];
//        c[2][1] = b[2];//nu
// 
        
    }
}
