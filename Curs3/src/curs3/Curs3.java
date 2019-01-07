package curs3;

import java.util.Date;

public class Curs3 {

    public static void main(String[] args) {
//    Person a = new Person();     
//   a.metod1(4);
//        System.out.println(a.x);

Pistol pp = new Pistol();

pp.punePiedica();
pp.scoatePiedica();


pp.incarca();
pp.trage();
pp.stare();

        Person p = new Person(); //
        p.schimbaNume("Mihai");
        p.prezentare();
        p.mananca();
        p.prezentare();
        p.schimbaNume("Vlad");
        p.prezentare();
        p.IQ = 140;
        p.setX(6);

        System.out.println(p.numeComplet("Dana", "Miha"));

        StocProdus m = new StocProdus();
        System.out.println(m.stocNou("Mere", 5));
        p.spalaDinti();
        p.spalaMaini();
        p.rutinaLuareMasa();

        p.g();

        Person c = new Person();
        c.nume = "Ana";
        botez(c);//se efectueaza atribuirea x=p;
        //x va pointa acum catre acelasi obiect ca si p
        //valoarea unei variabile de tip referinta reprezinta o modalitate de a ajunge la un obiect din memorie
        System.out.println(c.nume);

        //p.cresteNumar();
        //p.cresteNumar(6);
        
        //metoda cu numar variabil de argumente
        System.out.println(Person.medie(1,2,3));
        System.out.println(Person.medie(1,2,3,4,4));
        Person.friends("Mihai", "Ana ", "Vlad", "Maria");
        
        //incapsulare
        Catzel ca = new Catzel();
        ca.scarpinare();
        System.out.println(ca.catiPurici());
       
        //get si set
        System.out.println("get " + p.getNrNatural());
        p.setNrNatural(4);
        
    }

    public static void botez(Person x) {
        x.nume = "Mihai";

        x = null;
    }
    
   

}
