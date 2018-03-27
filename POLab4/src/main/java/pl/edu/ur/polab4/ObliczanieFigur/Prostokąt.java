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
public class Prostokąt {
    public int a;
    public int b;
    public int pole;
    public int obw;
    public  Prostokąt(int a, int b){
       this.a=a;
       this.b=b;
    }
    public int pole(int a, int b){
       pole=a*b;
       return pole;
    }
    public int obw(int a, int b){
        obw=2*a+2*b;
        return obw;
    }
    public void dane(){
        System.out.println("Pole "+pole(a,b));
        System.out.println("Obwód" +obw(a,b));
        
    }
    
}
