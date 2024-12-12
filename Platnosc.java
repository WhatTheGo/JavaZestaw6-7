import java.util.Objects;

public class Platnosc implements PlatnoscInterface{
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Unkown";
    }

    public Platnosc(double kwota, String statusPlatnosci) {
        this.kwota = kwota;
        this.statusPlatnosci = statusPlatnosci;
    }

    public void zaplac(){
        this.statusPlatnosci = "Opłacone";
        this.kwota = 0.0;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }

    public void setStatusPlatnosci(String statusPlatnosci) {
        this.statusPlatnosci = statusPlatnosci;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platnosc platnosc = (Platnosc) o;
        return Double.compare(getKwota(), platnosc.getKwota()) == 0 && Objects.equals(getStatusPlatnosci(), platnosc.getStatusPlatnosci());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKwota(), getStatusPlatnosci());
    }
}
