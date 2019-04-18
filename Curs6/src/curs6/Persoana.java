package curs6;


 class Persoana {
    String nume;

    Persoana(String nume) {

    }
    public String getNume(){
        return nume;
    }
    
    public void setNume(String n){
        nume = n;
    }
    public void prezentare(){
        System.out.println("Salut, eu sunt" + nume);
    }
    
    public static void intalnire(Persoana p){
        p.prezentare();
    }
    
    
    
   
    
}
