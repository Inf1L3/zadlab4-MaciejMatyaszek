package pl.edu.ur.polab4.ObliczanieFigur;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
public class Sześcian {
    public int a;
    public int obj;
    
    
    public Sześcian(int a){
        this.a=a;
        
    }
    public int objętość(int a){
        obj=a*a*a;
        return obj;
    }
    public void dane(){
        System.out.println("Objętość " +objętość(a));
    }
    
    
    
}
