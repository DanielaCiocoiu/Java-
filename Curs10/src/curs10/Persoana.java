/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rmaftei
 */
public class Persoana implements Serializable{
    
    private String nume;
    private List <Hobby> hobbies = new ArrayList<Hobby>();

    public Persoana(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }
    
    
    
}
