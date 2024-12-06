public class Platnosc {
    double kwota;
    String statusPlatnosci;

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
}
