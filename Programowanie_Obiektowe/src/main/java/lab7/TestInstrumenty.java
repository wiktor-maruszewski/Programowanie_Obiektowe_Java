package lab7;

import lab7.pl.imiajd.maruszewski.Flet;
import lab7.pl.imiajd.maruszewski.Fortepian;
import lab7.pl.imiajd.maruszewski.Instrument;
import lab7.pl.imiajd.maruszewski.Skrzypce;

import java.time.LocalDate;

public class TestInstrumenty {

    public static void main(String[] args) {

        Instrument[] Orkiestra = new Instrument[5];

        Instrument A = new Skrzypce("ABC", LocalDate.of(2000, 10, 20));
        Fortepian B = new Fortepian("ABCDEF", LocalDate.of(2003, 11, 5));
        Fortepian C = new Fortepian("ABC", LocalDate.of(2000, 10, 20));
        Flet D = new Flet("QWERTY", LocalDate.of(2015, 4, 15));
        Flet E = new Flet("ABC", LocalDate.of(2005, 3, 7));

        Orkiestra[0] = A;
        Orkiestra[1] = B;
        Orkiestra[2] = C;
        Orkiestra[3] = D;
        Orkiestra[4] = E;


        for(int i = 0; i < 5; i++){
            System.out.println(Orkiestra[i].dzwiek());
        }

        for(int i = 0; i < 5; i++){
            System.out.println(Orkiestra[i]);
        }


    }
}
