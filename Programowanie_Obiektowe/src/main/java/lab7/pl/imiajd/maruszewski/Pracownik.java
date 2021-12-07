package lab7.pl.imiajd.maruszewski;

import java.time.LocalDate;

public class Pracownik extends Osoba
{
    public LocalDate dataZatrudnienia;

    public Pracownik(String imiona[], String nazwisko, LocalDate dataUrodzenia, boolean plec, double pobory, LocalDate dataZatrudnienia)
    {
        super(imiona, nazwisko, dataUrodzenia, plec);
        this.dataZatrudnienia = dataZatrudnienia;
        this.pobory = pobory;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    private double pobory;
}