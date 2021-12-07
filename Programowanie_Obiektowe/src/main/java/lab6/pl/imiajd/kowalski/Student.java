package lab6.pl.imiajd.kowalski;

import lab6.pl.imiajd.kowalski.Osoba;

public class Student extends Osoba {
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek){
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }

    @Override
    public String toString() {
        return super.toString() + " kierunek: " + this.kierunek;
    }
}