package lab6.pl.imiajd.kowalski;

import javax.sound.midi.Soundbank;

public class Adres {
    private String ulica;
    private String numer_domu;
    private String numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    Adres(String ulica, String numer_domu, String numer_mieszkania, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    Adres(String ulica, String numer_domu, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz(){
        System.out.println(this.kod_pocztowy + " " + this.miasto);
        System.out.print(this.ulica + " " + this.numer_domu);
        if(this.numer_mieszkania != ""){
            System.out.println(" " + this.numer_mieszkania);
        }
        else{
            System.out.println();
        }
    }
}