package lab8;
import lab8.pl.imiajd.nazwisko.Osoba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {

    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>();

        grupa.add(new Osoba("Kowalski", LocalDate.of(2000,5,15)));
        grupa.add(new Osoba("Nowak", LocalDate.of(2001,7,22)));
        grupa.add(new Osoba("Kowalski", LocalDate.of(2005,11,5)));
        grupa.add(new Osoba("Bak", LocalDate.of(1998,9,12)));
        grupa.add(new Osoba("Stefan", LocalDate.of(2001,7,22)));

        System.out.println(grupa);

        Collections.sort(grupa);

        System.out.println(grupa);
    }
}
