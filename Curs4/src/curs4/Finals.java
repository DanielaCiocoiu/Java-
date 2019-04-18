/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs4;

/**
 *
 * @author rmaftei
 */
public class Finals {
    final StringBuffer s;
    Finals(){
        s= new StringBuffer ("test");
        s.append("ing");
         
    }
    public  void fin(){
        System.out.println(s);
    }
    
}
