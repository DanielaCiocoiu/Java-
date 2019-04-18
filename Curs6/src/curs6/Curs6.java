package curs6;

public class Curs6 {

    public static void main(String[] args) {
        
        
		B b1 = new C();
		b1.m();
                System.out.println("-------");  
                
                
//                class A{}
//
//
//
//	
//		A a = new A();
//		B b = new B();
//		C c = new C();
//		D d = new D();
//                
//		b instanceof A;
// c instanceof B;
// c instanceof Object;
// a instanceof A;
// d instanceof C;
// d instanceof A;
//	}
//}
//        
//class B extends A{}
//class C extends B{}
//class D extends B{}        
//        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  Parinte o1 = new Parinte();
    Subclasa o2 = new Subclasa();
    o1.vorbeste(); //clasa parinte
    o2.vorbeste();// subclasa, masina tine cont de tipul de date referit de o2
        
        
        
        
        
        Instructor x = new Instructor("Mihai");
        Persoana p = new Persoana("Ana");
        x.setNume("Vivi");

        x.setNume("Mihai");
        x.prezentare();
        x.preda();
//o met care primeste ca argument o persoana accepta la apelare o valoare de tip instructor
        Mostenire.intalnire(p);
        Mostenire.intalnire(x);

//un tablou de persoane poate contine si obiecte de tip instructor
        Persoana[] grup = new Persoana[2];
        grup[0] = p;
        grup[1] = x;

//un ob instructor poate fi controlat cu o referinta de tip Persoana
//Persoana p = new Instructor("Vlad");
        Animal a = new Animal("generic");
        Pisica pis = new Pisica("Nemo");
        Caine c = new Caine("Azorel");
        Animal a1 = new Caine("Azor"); //upcasting
        
        
        a.mananca();
        c.mananca();
        a1.mananca();
        //a1.latra(); //nu merge
        Animal y = c;
        //y.latra(); //nu merge
        Caine w = (Caine)y;
        w.latra();
        
        Animal[] pets = {pis, c};
        pets[0].merge();
        pets[1].mananca();

        System.out.println(x instanceof Persoana);
        System.out.println(p instanceof Persoana);
        System.out.println(x instanceof Instructor);
        System.out.println(pis instanceof Animal);

        Subclasa s = new Subclasa();
        s.x = true;
        s.setX(4);
        System.out.println(s.x); //subclasa
        System.out.println(s.getX());
        s.f();

        
        urla(pis);
    }
    public static void urla(Animal a){
        System.out.println("upcasting " + a);
    }
    
  
       

}
