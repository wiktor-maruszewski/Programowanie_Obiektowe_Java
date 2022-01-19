package lab8.pl.imiajd.nazwisko;

import java.time.LocalDate;

public class Student extends Osoba {

    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen){
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public int compareTo(Osoba osoba) {
        if (osoba.getClass() == this.getClass()){
            if (this.sredniaOcen > ((Student) osoba).sredniaOcen){
                return 1;
            }
            else if(this.sredniaOcen < ((Student) osoba).sredniaOcen){
                return -1;
            }
            else{
                return 0;
            }
        }
        return super.compareTo(osoba);
    }
}
