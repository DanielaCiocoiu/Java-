

package curs8part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

interface C{ //nu, lmbda nu poate fi folosit aici
    void f(String s);
    void g();
}
interface B{
    
  String f();
}
interface D{
  void f(String s);
}
interface A{
     void f();
}

public class Curs8Part2 {

    public static void main(String[] args) {
        
//        C c = ()-> System.out.print(" C ");
//        B b = ()-> "ab".compareTo("cd");
        
        
        
        //   public boolean contains(element);    //collection
//
// public int size();                     //collection
//  {}
// public int indexOf(element);           // list - nu este in collections
//  {}
// public boolean add(element);           //collection, list
//  {}
//--------------------------------------------------------------
        //List<String> col = Arrays.asList("cd", "ab", "bc");//care va ordona col alfabetic?

//        Collections.sort(col, (String s1, String s2) -> {
//        return s1.compareTo(s2);
//
//        });
//        System.out.println(col);
//        Collections.sort(col);
//        System.out.println(col);
//Collections.sort(col, {s1, s2} -> s1.compareTo(s2)); //-nu
//            Collections.sort(col, new Comparator<String>() {
//            public int compare(String s1, String s2) {
//                return s1.compareTo(s2);
//            }
        //col.sort(); //nu
//           Collections.sort (col,(s1, s2) -> s1.compareTo(s2));
//           System.out.println(col);
        //Collections.sort (col,new Comparator<String>((s1,s2)->s1.compareTo(s2)));//nu
//            Collections.sort (col, String::compareTo);
//            System.out.println(col);
//---------------------------------
//Arrays.asList(new String()); //da
//
//public List<String> m(){ return new LinkedList<>(); } //da
//new LinkedList<>(new ArrayList<String>());//da
// 
//
//List<Object> list = new ArrayList<>();//da
// 
//
//public void m(List<String> list){}//da
//m(new LinkedList<>());
//------------------------
//List<? extends String> c = new ArrayList<>();//nu
////c.add(new String());
// List<Object> d = new ArrayList<>();
// d.add(new String());
// List<? extends Object> e = new ArrayList<>();
// e.add(new String());//nu
// List<? super String> f = new ArrayList<>();
// f.add(new String());
//-----------------------------
//Set strings = new HashSet();
//strings.add("abc");
//strings.add("def");
//strings.add("ghi");
//
//for(int i=0; i<strings.size(); i++){
//	System.out.println(strings.get(i));
//}
//for(int i=0; i<strings.length(); i++){
//	System.out.println(strings.get(i));
//}
//for(String s:strings){
//	System.out.println(s);
//}
//for(Object s:strings){
//	System.out.println((String)s);
//}
//Iterator i = strings.iterator();
//while(i.hasNext()){
//	System.out.println(i.next());
//}
//for(Iterator i = strings.iterator(); i.hasNext();){
//	System.out.println(i.next());
//}
//------------------------
//Map m = new TreeMap();
// 
//
//for(Object o:m.values()){
//	System.out.println(m.get(o));
//}
// 
//
//for(int i=0; i<m.size(); i++){
//	System.out.println(m.get(i));
//}
// 
//
//for(Object o:m.keySet()){
//	System.out.println(m.get(o));
//}
// 
//
//for(Object o:m){
//	System.out.println(o);
//}
//----------------
//List<Car> list = new ArrayList<>();
//----------------
// Collection<?> c = new ArrayList<String>();
// Collection<Object> a = new ArrayList<? extends Object>();
// Collection<? extends Object> c = new ArrayList<? extends Object>();
// Collection<Object> b = new ArrayList<>();
// Collection<Object> f = new ArrayList<Object>();
// Collection<Object> g = new ArrayList<String>();
        //------------------------------------
 Map m = new HashMap();
Object o1 = "one", o2 = "two";

 m.put(o1,o2);
 m.insert(o1,o2);
 m.add(o1);
 m.put(o2);
 m.add(o1,o2);


//Collection<String> c = new ArrayList(); //va compila

//	String f();
////void f(String s);
//	void g();
//        void f(String s);
//        void f();
    }
}

