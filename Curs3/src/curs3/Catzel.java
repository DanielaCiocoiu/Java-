
package curs3;


public class Catzel {
    
    private int nrFirePar;
    private String nume;
    private int nrPurici;
    
    public Catzel(String n, int nr){
        nume = n;
        nrPurici = nr;
        
    }
    public Catzel(String n){
        this(n,0); //apelez un ctor din cadrul altuia
        //this trebuie sa fie primul
    }
    public Catzel(){ //instantiere fara argumente
        this("Caninonimul", 0);
    }
    
    
    
    
    public void scarpinare(){
        nrPurici--;
        nrFirePar-=10;
        System.out.println(nrPurici);
        System.out.println(nrFirePar);
    }
    public int catiPurici(){
        return nrPurici;
    }
    
}
