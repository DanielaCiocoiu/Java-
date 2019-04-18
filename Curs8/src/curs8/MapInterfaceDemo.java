//Maps are perfectly for key-value association mapping such as dictionaries.
//Use Maps when you want to retrieve and update elements by keys, or perform lookups by keys. Some examples:
//
//A map of error codes and their descriptions.
//A map of zip codes and cities.
//A map of managers and employees. Each manager (key) is associated with a list of employees (value) he manages.
//A map of classes and students. Each class (key) is associated with a list of students (value).
// NU pastreaza ordinea

package curs8;

// Java program to demonstrate working of Map interface
import java.util.*;

public class MapInterfaceDemo {

    public static void mapInterfaceDemo() {

        HashMap< String, Integer> hm = new HashMap< String, Integer>();
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));
        hm.remove("d");

        System.out.println("contine cheia e? = " + hm.containsKey("e"));  
        
        System.out.println("keySet" + hm.keySet());
       
hm.putAll(hm);

for( String Key: hm.keySet()){
     Integer value = hm.get(Key);
     System.out.println("Iterare cu for each - " + "Key = " + Key + ", Value = " + value);
}

        // Returns Set view     
        Set< Map.Entry< String, Integer>> st = hm.entrySet();

        for (Map.Entry< String, Integer> me : st) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}
