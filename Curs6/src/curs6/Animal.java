/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs6;

/**
 *
 * @author rmaftei
 */

class A{
	void m(){ System.out.println("A"); }
}
class B extends A{
	void m(){ System.out.println("B"); }
}
//---------phone------------

class Phone{}
class MobilePhone extends Phone{}
class SmartPhone extends MobilePhone{}

class Test{
	//void f(MobilePhone p){}
	public static void main(String[] args){
		//Test t = new Test();
		MobilePhone p1 = new MobilePhone();
		SmartPhone p2 = new SmartPhone();
		MobilePhone p3 = new SmartPhone();
		Phone p4 = new MobilePhone();
		p1=(MobilePhone)p2;
                p3=(SmartPhone)p1;
                 p4=(SmartPhone)p1;
                 //p2=(MobilePhone)p1;
                   p3=(SmartPhone)p4;
                 
                
                
	}
}
//-------------------------


 

//----------------

public class Animal {
    
    String nume;
   
    public Animal(String n){
        
    }
     public void setNume(String n){
        nume = n;
    }
     public String getNume(){
         return nume;
     }
     
     public void merge(){
         System.out.println(nume + "Se plimba nepasator");
     }
     public void mananca(){
         System.out.println(nume + "Mananca cu pofta");
     }
    
    public String toString(){
        return nume;
    }
}
