package curs10;


import java.io.Serializable;


public class Hobby implements Serializable{
    private String nume;

    public Hobby(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
    
    
    
}
