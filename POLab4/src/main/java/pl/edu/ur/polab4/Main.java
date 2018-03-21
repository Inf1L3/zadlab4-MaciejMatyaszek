package pl.edu.ur.polab4;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie= sc.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko=sc.nextLine();
        System.out.println("Podaj specjalnosc");
        String specjalnosc= sc.nextLine();
        System.out.println("Podaj wiek");
        int wiek= sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj numer indeksu");
        int numerindeksu=sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj rok studiow");
        int rokstudiow=sc.nextInt();
        sc.nextLine();
        Student s1= new Student(imie, nazwisko, wiek, numerindeksu, specjalnosc, rokstudiow);
        // TODO zad 4, 5
        System.out.println(s1.toString());
    }
    
}
