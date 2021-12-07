package lab7.pl.imiajd.maruszewski;

import java.time.LocalDate;

public abstract class Osoba
{
    private String imiona[];
    private LocalDate dataUrodzenia;
    private boolean plec;

    public Osoba(String imiona[], String nazwisko, LocalDate dataUrodzenia, boolean plec)
    {
        this.imiona = imiona;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public String[] getImiona() {
        return imiona;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean getPlec(){
        return this.plec;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    private String nazwisko;
}