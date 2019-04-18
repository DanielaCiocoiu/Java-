package java;

public class Radio {
    
    private int maxVol;
    private int volum;
    private boolean pornit;
    private String[] post;
    private int postCurent;
    
    public int getmaxVol() {
        
        return maxVol;
    }
    
    public int getvolum() {
        return volum;
    }
    
    public Radio(int max) {
        
    }
    
    public boolean getpornit() {
        return pornit;
    }
    
    public String[] getpost() {
        return post;
    }
    
    public int getpostCurent() {
        return postCurent;
    }
    
    public void porneste() {
        if (pornit) {
            System.out.println("On");
        } else {
            System.out.println("Off");
        }
    }
    
    public void opreste() {
        if (pornit) {
            System.out.println("Off");
        }
    }
    
    public void daMaiTare() {
        if (pornit) {
            if (volum > 0) {
                if (volum < 10) {
                    volum++;
                }
                
            } else {
                System.out.println("Please On");
            }
        }
    }
    
    public void daMaiTare(int nrTrepte) {
        if (pornit) {
            if (volum > 0) {
                nrTrepte++;
            }
            
        }
        
    }
    
    public void daMaiIncet() {
        if (pornit) {
            if (volum < 10) {
                if (volum > 0) {
                    volum--;
                }
                
            }
        }
        
    }
    
    public void daMaiIncet(int nrTrepte) {
        if (pornit) {
            if (volum < 10) {
               nrTrepte--; 
            }
        }
    }
    
    public void postUrmator() {
        String [] post = {"unu", "doi", "trei"};
        for (int i = 0; i < post.length - 1; i++) {
           
        }
  
    }
    
    public void postPrecedent() {
        
        for (int i = 0; i < post.length; i--) {
            
        }
        
    }
    
    public void stare() {
        
    }
    
}
