/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs8;

import java.util.HashSet;

/**
 *
 * @author rmaftei
 */
public class HashSetDemo {

    public static void runHashSet() {
        HashSet<String> hs = new HashSet<String>();
        // Adding element to HashSet
        hs.add("M");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("M");
        hs.add("X");
        System.out.println("Size of HashSet=" + hs.size());
        System.out.println("Original HashSet:" + hs);
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        System.out.println("Trying to Remove Z which is not present: "
                + hs.remove("Z"));
        System.out.println("Checking if M is present=" + hs.contains("M"));
        System.out.println("Updated HashSet: " + hs);
    }

}
