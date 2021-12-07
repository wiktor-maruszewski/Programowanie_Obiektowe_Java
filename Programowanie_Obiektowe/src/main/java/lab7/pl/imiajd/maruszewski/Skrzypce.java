package lab7.pl.imiajd.maruszewski;
import java.time.LocalDate;

public class Skrzypce extends Instrument{

    public Skrzypce(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }

    @Override
    public String dzwiek() {
        return "tiiiiiiriiiiiiiiirii";
    }
}
