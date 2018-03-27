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
public class Koło {
    public  int r;
    public double pole;
    public double obw;
    public Koło(int r){
        this.r=r;
    }  
    public double pole(double r){
      pole=Math.PI*r*r;
      
      return pole;
    }
    public double obw(double r){
        obw=2*Math.PI*r;
        return obw;
    }
    public void dane(){
        System.out.println("Pole "+pole(r));
        System.out.println("Obwód "+obw(r));
    }
    
}

    
   
