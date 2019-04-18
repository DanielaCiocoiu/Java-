/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs8;

import java.util.*;

public class CollectionsDemo {

    public static void runCollectionsDemo() {
        // ArrayList 
        List a1 = new ArrayList();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");

        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        List<Integer> list = new ArrayList<Integer>();
        list.add(46);
        list.add(67);
        list.add(24);
        list.add(16);
        list.add(8);
        list.add(12);
        list.indexOf(a1);
        System.out.println("Value of maximum element from the collection: " + Collections.max(list));
        System.out.println("Size-ul listei este: " + list.size());
         System.out.println("Lista este goala: " + list.isEmpty());
         System.out.println("Lista contine 111: " + list.contains(111));
        
        // LinkedList
        List l1 = new LinkedList();
        l1.add("Zara");
        l1.add("Mahnaz");
        l1.add("Ayan");
      l1.indexOf("Ayan");
       
        
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);

        // HashSet
        Set s1 = new HashSet();
        s1.add("Zara");
        s1.add("Mahnaz");
        s1.add("Ayan");
        //fara indexOf
                
        System.out.println();
        System.out.println(" Set Elements");
        System.out.print("\t" + s1);

        // HashMap
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
      
        System.out.println();
        System.out.println(" Map Elements");

        System.out.print("\t" + m1);
        
        
        
        
    }

}
