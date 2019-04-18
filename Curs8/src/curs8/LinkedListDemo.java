/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs8;

import java.util.LinkedList;

/**
 *
 * @author rmaftei
 */
public class LinkedListDemo {

    public static void runLinkedListDemo() {
        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.addFirst("A");
        myLinkedList.add("B");
        myLinkedList.add("C");
        myLinkedList.add("D");
        myLinkedList.add(2, "X");//This will add C at index 2
        myLinkedList.addLast("Z");
        System.out.println("Original List before deleting elements");
        System.out.println(myLinkedList);
        myLinkedList.remove();
        myLinkedList.removeLast();
        myLinkedList.remove("C");
        System.out.println("Original List After deleting first and last object");
        System.out.println(myLinkedList);
        System.out.println("First object in linked list: " + myLinkedList.getFirst());
        System.out.println("Last object in linked list: " + myLinkedList.peekLast());
    }

}
