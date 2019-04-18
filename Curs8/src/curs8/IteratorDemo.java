/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs8;

        // Java code to illustrate the use of iterator
import java.io.*;
import java.util.*;

public class IteratorDemo {
    
    
    public static void iteratorDemo(){
        

         ArrayList<String> list = new ArrayList<String>();
 
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
 
        // Iterator to traverse the list
        Iterator iterator = list.iterator();
 
        System.out.println("List elements : ");
 
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
 
        System.out.println();
    }
    
}
