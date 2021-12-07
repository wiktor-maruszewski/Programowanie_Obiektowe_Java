package lab6.pl.imiajd.kowalski;

import lab6.pl.imiajd.kowalski.Osoba;

public class Nauczyciel extends Osoba {
    private double pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, double pensja){
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    public double getPensja() {
        return pensja;
    }

    @Override
    public String toString() {
        return super.toString() + " pensja: " + this.pensja;
    }
}