
package curs8;


import java.util.*;
import java.io.*;

public class HashMapDemo1{
    public static void runHashMapDemo1(){
        Scanner in = new Scanner(System.in);
         HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
           
            hm.put(name, phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
          
               if(hm.containsKey(s)){
                   System.out.println(s + "=" + hm.get(s));
                  
               }else{
                   System.out.println("Not found");
                   }
            
        }
        in.close();
    }
    }