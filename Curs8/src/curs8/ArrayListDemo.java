/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs8;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rmaftei
 */
public class ArrayListDemo {

    public static void run() {
        //declaring Arraylist of String objects
        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Orange");
        myList.add("Grapes");
        //Adding object at specific index
        myList.add(1, "Orange");
        myList.add(2, "Pinapple");
        System.out.println("Print All the Objects:");
        for (String s : myList) {
            System.out.println(s);
        }
        System.out.println("Object at index 3 element from list: " + myList.get(3));
        System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
        System.out.println("Size of ArrayList: " + myList.size());
        myList.remove("Papaya");
        System.out.println("New Size of ArrayList: " + myList.size());
    }

    public static void run1(){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Raji");//Adding object in arraylist  
  list.add("Vijay");  
  list.add("Raju");  
  list.add("Ajith"); 
  //varianta for
  for(String obj: list)
        System.out.println(obj);
  
  //Traversing list through Iterator  
  Iterator itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next()); 
    }
  
}
}