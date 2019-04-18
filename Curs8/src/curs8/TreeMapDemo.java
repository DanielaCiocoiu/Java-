/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs8;

import java.util.*;  

/**
 *
 * @author rmaftei
 */
public class TreeMapDemo {

    public static void runTreeMapDemo() {
        //Creating Map of Fruit and price of it
        // Create and populate tree map  
   Map<Integer, String> map = new TreeMap<Integer, String>();           
   map.put(102,"Let us C");  
   map.put(103, "Operating System");  
   map.put(101, "Data Communication and Networking");  
   System.out.println("Values before remove: "+ map);    
   // Remove value for key 102  
   map.remove(102);  
   System.out.println("Values after remove: "+ map);  
    }
}
