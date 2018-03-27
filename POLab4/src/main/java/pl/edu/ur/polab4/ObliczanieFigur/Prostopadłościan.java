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
public class Prostopadłościan {
    public int a;
    public int b;
    public int c;
    public int obj;

 
    public Prostopadłościan(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int obj(int a, int b, int c){
        obj=a*b*c;
        return obj;
    }
    public void dane(){
        System.out.println("Objętość" +obj(a,b,c));
    }
    
}
