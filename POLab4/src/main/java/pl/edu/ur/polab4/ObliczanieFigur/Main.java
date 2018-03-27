package pl.edu.ur.polab4.ObliczanieFigur;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Podaj imie");
       // String imie = sc.nextLine();
        ///System.out.println("Podaj nazwisko");
        //String nazwisko = sc.nextLine();
        //System.out.println("Podaj specjalnosc");
        //String specjalnosc = sc.nextLine();
        //System.out.println("Podaj wiek");
        //int wiek = sc.nextInt();
        //sc.nextLine();
        //System.out.println("Podaj numer indeksu");
        //int numerindeksu = sc.nextInt();
        //sc.nextLine();
        //System.out.println("Podaj rok studiow");
        //int rokstudiow = sc.nextInt();
        //sc.nextLine();
        //Student s1 = new Student(imie, nazwisko, wiek, numerindeksu, specjalnosc, rokstudiow);
        // TODO zad 4, 5
       // System.out.println(s1.toString());

        //zad 4
        Scanner input = new Scanner(System.in);
        System.out.println("Wybierz figure:");
        System.out.println("1) Kolo");
        System.out.println("2) Kwadrat");
        System.out.println("3) Prostokat");
        System.out.println("4) Szescian");
        System.out.println("5) Prostopadloscian");
        System.out.println("6) Kula");
        System.out.println("7) Stozek");
        int f=input.nextInt();
        
        switch (f) {
            case 1:
                System.out.println("Podaj promień");
                int a=input.nextInt();
                Koło kolo1=new Koło(a);
                kolo1.dane();
                break;
            case 2:
                System.out.println("Podaj bok");
                int b=input.nextInt();
                Kwadrat kwadrat1=new Kwadrat(b);
                kwadrat1.dane();
                break;
            case 3:
                System.out.println("Podaj bok a");
                int c=input.nextInt();
                System.out.println("Podaj bok b");
                int d=input.nextInt();
                Prostokąt prostokat1=new Prostokąt(c,d);
                prostokat1.dane();
                break;
            case 4:
                System.out.println("Podaj bok a");
               int e=input.nextInt();
               Sześcian szescian1=new Sześcian(e);
               szescian1.dane();
               break;
            case 5:
                System.out.println("Podaj bok a");
                int v=input.nextInt();
                System.out.println("Podaj bok b");
                int g=input.nextInt();
                System.out.println("Podaj bok c");
                int h=input.nextInt();
                Prostopadłościan prostopadloscian1=new Prostopadłościan(v,g,h);
                prostopadloscian1.dane();
                break;
            case 6:
                System.out.println("Podaj promien");
                int i=input.nextInt();
                System.out.println("Podaj bok");
                int j=input.nextInt();
                Kula kula1=new Kula(i,j);
                kula1.dane();
                break;
            case 7:
                System.out.println("Podaj wysokość");
               int k=input.nextInt();
                System.out.println("Podaj bok");
                int l=input.nextInt();
                Stożek stozek1=new Stożek(k,l);
                stozek1.dane();
                break;
                
                
                
                
            }
        }
    }


