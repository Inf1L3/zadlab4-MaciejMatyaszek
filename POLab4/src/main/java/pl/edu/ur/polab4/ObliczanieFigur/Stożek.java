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
public class Stożek {
    public int h;
    public int r;
    public double obj;
    public Stożek(int h, int r){
        this.h=h;
        this.r=r;
    }
    public double objętość(int h, int r){
        obj=1/3*Math.PI*r*r*h;
        return obj;
        
    }
    public void dane(){
        System.out.println("Objętość "+objętość(h,r));
    }
    
    
}
