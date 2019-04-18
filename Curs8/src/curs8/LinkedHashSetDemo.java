/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs8;

import java.util.LinkedHashSet;

/**
 *
 * @author rmaftei
 */
public class LinkedHashSetDemo {
     public static void runLinkedHashSetDemo(){
         LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		// Adding element to LinkedHashSet
		linkedset.add("Maruti");
		linkedset.add("BMW");
		linkedset.add("Honda");
		linkedset.add("Audi");
		linkedset.add("Maruti"); //This will not add new element as Maruti already exists
		linkedset.add("WalksWagon");
		System.out.println("Size of LinkedHashSet=" + linkedset.size());
		System.out.println("Original LinkedHashSet:" + linkedset);
		System.out.println("Removing Audi from LinkedHashSet: " + linkedset.remove("Audi"));
		System.out.println("Trying to Remove Z which is not present: "
				+ linkedset.remove("Z"));
		System.out.println("Checking if Maruti is present=" + linkedset.contains("Maruti"));
		System.out.println("Updated LinkedHashSet: " + linkedset);
         
     }
             
}
