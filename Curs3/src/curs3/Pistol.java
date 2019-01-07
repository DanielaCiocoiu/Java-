package curs3;

public class Pistol {

    public int nrGloante;
    public int maxGloante = 3;
    public boolean piedica = true;

    
    
     
    public void punePiedica() {
        if (piedica) {
            System.out.println("punePiedica - Este deja pusa: ");//v
        } else {
            piedica = true;
            System.out.println("punePiedica - S-a pus piedica");
        }
    }
 
    public void scoatePiedica() {
        if (!piedica) {
            System.out.println("scoatePiedica - E deja scoasa");
        } else {
            piedica = false;
            System.out.println("scoatePiedica - S-a scos piedica"); //v
        }
    }

    

    public void incarca() {
        if (nrGloante == maxGloante) {
            System.out.println("incarca - E deja full");
        } else {
            nrGloante = maxGloante;
            System.out.println("incarca - Ati reincarcat");//v
        }
    }
    
     public void trage() { 
        if (piedica) {
            System.out.println("trage - E piedica pusa"); 
            return;
        }
        if (nrGloante == 0) {
            System.out.println("trage - Nu mai aveti gloante");
            return;
        }
        nrGloante--;
        System.out.println("trage - Foc");
    }

    public void stare() {
        System.out.println("Piedica este: " + (piedica ? "pusa" : "Scoasa"));
        System.out.println("Mai aveti " + nrGloante + " gloante");
    }

}
