package lab7.pl.imiajd.maruszewski;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji){
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    public abstract String dzwiek();

    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Instrument other = (Instrument) obj;
        if (this.producent != other.producent)
            return false;
        if (this.rokProdukcji != other.rokProdukcji)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "producent= '" + producent + '\'' +
                ", rokProdukcji= " + rokProdukcji +
                '}';
    }
}
