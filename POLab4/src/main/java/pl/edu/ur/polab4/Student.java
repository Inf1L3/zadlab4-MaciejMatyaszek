/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author student
 */
public class Student {

    private String imie;
    private String nazwisko;
    private int wiek;
    private int numerindeksu;
    private String specjalnosc;
    private int rokstudiow;

    /**
     *
     * @param imie
     * @param nazwisko
     * @param wiek
     * @param numerindeksu
     * @param nazwa
     * @param specjalnosc
     * @param rok
     */
    public Student(String imie, String nazwisko, int wiek, int numerindeksu, String specjalnosc, int rokstudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.numerindeksu = numerindeksu;
        this.specjalnosc = specjalnosc;
        this.rokstudiow = rokstudiow;

    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = 0;
        this.numerindeksu = 12233;
        this.specjalnosc = "specjalnosc";
        this.rokstudiow = 1;
    }

    public Student(int wiek, int numerindeksu) {
        this.wiek = wiek;
        this.numerindeksu = numerindeksu;
         this.imie = "imie";
        this.nazwisko = "nazwisko";
         this.specjalnosc = "specjalnosc";
        this.rokstudiow =1;
    }

    public Student(String specjalnosc, int rokstudiow) {
        this.specjalnosc = specjalnosc;
        this.rokstudiow = rokstudiow;
        this.imie = "imie";
        this.nazwisko = "nazwisko";
        this.wiek = 6;
        this.numerindeksu = 1234;
    }

    public Student(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
         this.numerindeksu = 12233;
        this.specjalnosc = "specjalnosc";
        this.rokstudiow = 2;
    }

    @Override
    public String toString() {
        return "Student{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + ", numerindeksu=" + numerindeksu + ", specjalnosc=" + specjalnosc + ", rokstudiow=" + rokstudiow + '}';
    }

}
