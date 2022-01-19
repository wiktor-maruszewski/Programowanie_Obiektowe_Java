package lab8.pl.imiajd.nazwisko;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba> {
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba [" + this.nazwisko + " " + this.dataUrodzenia.getYear() + "-" + this.dataUrodzenia.getMonth() + "-" + this.dataUrodzenia.getDayOfMonth() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(nazwisko, osoba.nazwisko) && Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    @Override
    public int compareTo(Osoba osoba) {
        if (this.dataUrodzenia.isAfter(osoba.dataUrodzenia)){
            return 1;
        }
        else if (this.dataUrodzenia.isBefore(osoba.dataUrodzenia)){
            return -1;
        }
        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

