package pl.edu.ur.polab4.Wprowadźdane;


import java.util.Scanner;
 
public class Main {
 
 
    public static void main(String[] args) {
        Student[] t = new Student[100];
        for (int i = 0; i < 100; i++) {
 
            t[i] = new Student("", "", 0, "", 0);
 
        }
        int e;
 
        Scanner input = new Scanner(System.in);
        int sw;
        do {
 
            System.out.println("1  Wprowadz dane studenta pod wybrany indeks tablicy");
            System.out.println("2  Usun dane studenta");
            System.out.println("3  Edytuj dane studenta z danego indeksu");
            System.out.println("4  Pokaż wszystkich studentow");
            System.out.println("5  Wyswietl dane wybranego studenta");
            System.out.println("0  Zamknięcie programu");
 
 
            sw = input.nextInt();
            input.nextLine();
 
            switch (sw) {
                case 1:
 
                    System.out.println("Podaj numer indeksu");
                    int i1 = input.nextInt();
                    t[i1].wprowadzDane();
                    break;
 
                case 2:
 
                    System.out.println("Podaj numer indeksu");
                    int i3 = input.nextInt();
                    t[i3] = new Student("", "", 0, "", 0);
                    t[i3].pokazDane();
                    break;
 
                case 3:
 
                    System.out.println("Podaj numer indeksu");
                    int i2 = input.nextInt();
                    t[i2].wprowadzDane();
                    break;
 
                case 4:
 
                    System.out.println("Podaj numer indeksu");
                    for (int i = 0; i < 100; i++) {
                        t[i].pokazDane();
                    }
                    break;
 
                case 5:
 
                    System.out.println("Podaj numer indeksu");
                    int i4 = input.nextInt();
                    t[i4].pokazDane();
                    break;
                case 0:
                    System.out.println("Program zostanie zamknięty ");
                default:
                    System.out.println("Błędny numer");
                    break;
            }
 
 
        } while (sw != 0);
    }
}