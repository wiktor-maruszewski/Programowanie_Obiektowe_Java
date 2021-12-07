package lab7.pl.imiajd.maruszewski;

import java.time.LocalDate;

public class Student extends Osoba
{
    double sredniaOcen;

    public Student(String imiona[], String nazwisko, LocalDate dataUrodzenia, boolean plec, String kierunek, double sredniaOcen)
    {
        super(imiona, nazwisko, dataUrodzenia, plec);
        this.sredniaOcen = sredniaOcen;
        this.kierunek = kierunek;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }

    private String kierunek;
}