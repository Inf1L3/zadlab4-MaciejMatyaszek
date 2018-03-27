package pl.edu.ur.polab4.ObliczanieFigur;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Kwadrat {
    
    public int a;
    public int pole;
    public int obw;
    public Kwadrat(int a){
        this.a=a;
        
    }
    public int pole(int a){
        pole=a*a;
        return pole;
    }
    
    public int obw(int a){
        obw=4*a;
        return obw;
    }
    public void dane(){
        System.out.println("Pole " +pole(a));
        System.out.println("Obwód " +obw(a));
    }
}
