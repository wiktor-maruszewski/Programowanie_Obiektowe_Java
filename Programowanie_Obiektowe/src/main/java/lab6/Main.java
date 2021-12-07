package lab6;

import lab6.pl.imiajd.kowalski.BetterRectangle;
import lab6.pl.imiajd.kowalski.Nauczyciel;
import lab6.pl.imiajd.kowalski.Osoba;
import lab6.pl.imiajd.kowalski.Student;

public class Main {


    public static void main(String[] args) {

        Osoba A = new Osoba("Kowalski", 2000);
        Student B = new Student("Nowak", 1999, "Informatyka");
        Nauczyciel C = new Nauczyciel("Bak", 1990, 4500);

        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());

        System.out.println(A.getNazwisko());

        BetterRectangle D = new BetterRectangle(10, 20, 5, 10);
        System.out.println(D.getArea());
        System.out.println(D.getPerimeter());

    }

}