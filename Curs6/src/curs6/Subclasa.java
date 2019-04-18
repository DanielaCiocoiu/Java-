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
 class Subclasa extends Parinte {
    
    public boolean x;
    public void f(){
        System.out.println("x-ul din subclasa: " + x);
        System.out.println("x-ul din parinte: " + super.x);
    }
    public void vorbeste(){
        System.out.println("Omul vorbeste mult in clasa derivata");
    }
    
}


