package curs3;

import java.util.Date;

public class Person {
    

//    int x;
//   public void metod1(int x){
//        x=8;
//        metod2(this.x);
//    }
//   public void metod2(int x){
//        x++;
//    }
//    

    String nume;
    int greutate = 50;
    public int IQ;
    int x = 4;
    int y;

    
    
    
    public void setX(int x) {
        this.x = x;
        System.out.println("This se refera la campul x al clasei.Variabila locala are intotdeauna intaietate " + x);
    }

    public void invata() {
        this.IQ++;//o referinta predefinita care pointeaza catre obiectul curent

    }

    public String numeComplet(String prenume, String numeFamilie) {

        return prenume.concat(" ").concat(numeFamilie);

    }

    public void prezentare() {

        System.out.println("Salut, sunt " + nume + " si am " + greutate + " de kilograme");

    }

    public void schimbaNume(String n) {
        nume = n;

    }

    public void spalaMaini() {

    }

    public void spalaDinti() {

    }

    public void mananca() {
        greutate++;
    }

    public void rutinaLuareMasa() {
        spalaMaini();
        mananca();
        spalaDinti();

    }

    public void f(int x) {
        x++;
    }

    public void g() {
        int a = 3;
        f(a);//se realizeaza atribuirea x= a;
        //variabila locala x este initializata cu o copie a valorii lui a
        //tehnic nu am pasat variabila a ci un duplicat al valorii ei
        System.out.println(a);
    }

//   public int cresteNumar(int cuCat){
//       y+=cuCat;
//        System.out.println(y);
//        return y;
//   }
//   public int cresteNumar(){
//       cresteNumar(1);
//       System.out.println(cresteNumar(1));
//        return cresteNumar();
//   }
    //metoda cu numar variabil de argumente
    public static double medie(int... nr) {
        int suma = 0;
        for (int i = 0; i < nr.length; i++) {
            suma += nr[i];
        }
        return ((double) suma) / nr.length;
    }

    //argumente cu numar variabil, 1 singur argument, se pozitioneaza la sfarsit
    //met trebuie apelata cu cel putin un argument de tip string
    public static void friends(String nume, String... prieteni) {
        System.out.println("Prietenii lui " + nume + " sunt:");
        for (String s : prieteni) {
            System.out.println(s);
        }
    }
    
    
    //getter - accesor
    //setter - modificator
    private int nrNatural = 5;
    //get are return si nu are argumente
    public int getNrNatural(){
        return nrNatural;
    }
    //set- void, nu are date de intoarcere, are argumente
    public void setNrNatural(int n){
        if (n>0) {
            nrNatural = n;
        }
        else 
            System.out.println("Eroare! " +n+  " este  negativ!");
        System.out.println("Set " + n);
    }
    
    
}
