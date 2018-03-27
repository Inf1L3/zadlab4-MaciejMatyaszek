/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.Wprowadźdane;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Student {

    public String imie;
    public String nazwisko;
    public int nrindeksu;
    public String specjalnosc;
    public int rok;
    Scanner input = new Scanner(System.in);

    public Student(String imie, String nazwisko, int nrindeksu, String specjalnosc, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrindeksu = nrindeksu;
        this.specjalnosc = specjalnosc;
        this.rok = rok;
    }

    public Student(String nazwisko, String imie) {

        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(String imie) {

        this.imie = imie;
    }

    public Student(int rok, String imie) {

        this.rok = rok;
        this.imie = imie;
    }

    public Student(int rok) {

        this.rok = rok;
    }

    public void pokazDane() {
        System.out.println("Osoba");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println(this.nrindeksu);
        System.out.println(this.specjalnosc);
        System.out.println(this.rok);
    }

    public void wprowadzDane() {

        System.out.println("Imie: ");
        imie = input.nextLine();
        System.out.println("Nazwisko: ");
        nazwisko = input.nextLine();
        System.out.println("Nrindeksu: ");
        nrindeksu = input.nextInt();
        System.out.println("Specjalnosc: ");
        specjalnosc = input.next();
        System.out.println("Rok: ");
        rok = input.nextInt();

    }
}
