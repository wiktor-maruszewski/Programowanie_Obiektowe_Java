package lab7;

import lab7.pl.imiajd.maruszewski.Osoba;
import lab7.pl.imiajd.maruszewski.Pracownik;
import lab7.pl.imiajd.maruszewski.Student;

import java.time.LocalDate;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        String[] imiona0 = {"Jan"};
        String[] imiona1 = {"Małgorzata", "Ania"};

        ludzie[0] = new Pracownik(imiona0, "Kowalski", LocalDate.of(1995,10,20), false, 50000, LocalDate.of(2020, 8, 10));
        ludzie[1] = new Student(imiona1, "Kowalska", LocalDate.of(2000, 3, 5), true, "informatyka", 4.45);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        System.out.println(ludzie[0].getImiona()[0]);
        System.out.println(ludzie[0].getDataUrodzenia());
        System.out.println(ludzie[0].getPlec());

        String [] imiona3 = {"Maciej"};
        Pracownik pracownik1 = new Pracownik(imiona3, "Nowak", LocalDate.of(1995,10,20), false, 50000, LocalDate.of(2020, 8, 10));
        System.out.println(pracownik1.getDataZatrudnienia());
        String [] imiona4 = {"Monika", "Asia"};
        Student student1 = new Student(imiona4,"Kowalska", LocalDate.of(2000, 3, 5), true, "informatyka", 4.2);
        student1.setSredniaOcen(4.65);
        System.out.println(student1.getSredniaOcen());

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}
