/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs8;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author rmaftei
 */
public class LinkedHashMapDemo {

    public static void runLinkedHashMapDemo() {
        //Here Insertion order maintains 
        Map<Integer, String> lmap = new LinkedHashMap<Integer, String>();
        lmap.put(12, "Mahesh");
        lmap.put(5, "Naresh");
        lmap.put(23, "Suresh");
        lmap.put(9, "Sachin");
        System.out.println("LinkedHashMap before modification" + lmap);
        System.out.println("Is Employee ID 12 exists: " + lmap.containsKey(12));
        System.out.println("Is Employee name Amit Exists: " + lmap.containsValue("Amit"));
        System.out.println("Total number of employees: " + lmap.size());
        System.out.println("Removing Employee with ID 5: " + lmap.remove(5));
        System.out.println("Removing Employee with ID 3 (which does not exist): " + lmap.remove(3));
        System.out.println("LinkedHashMap After modification" + lmap);
    }
}
