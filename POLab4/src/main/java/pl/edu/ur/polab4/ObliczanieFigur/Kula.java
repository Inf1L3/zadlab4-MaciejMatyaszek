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
public class Kula {

    public int r;
    public int h;
    public double obj;

    public Kula(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public double objetosc(int r, int h) {
        obj=1/3*r*r*h;
        return obj;
  
    }
    public void dane(){
        System.out.println("Objętość "+objetosc(r,h));
    }
}
