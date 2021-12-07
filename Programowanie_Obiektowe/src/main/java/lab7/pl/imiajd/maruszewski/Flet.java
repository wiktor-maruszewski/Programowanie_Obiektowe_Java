package lab7.pl.imiajd.maruszewski;
import java.time.LocalDate;

public class Flet extends Instrument{

    public Flet(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }

    @Override
    public String dzwiek() {
        return "tuuuuruuruu";
    }
}
