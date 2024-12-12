import java.util.Objects;

public class Zamowienie implements ZamowienieInterface{
    private KoszykZakupowy koszyk;
    private String status;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszyk){
        this.koszyk = koszyk;
        this.status = "Unkown";
        this.platnosc = new Platnosc(koszyk.obliczCalkowitaWartosc());
    }
    public Zamowienie(KoszykZakupowy koszyk, String status){
        this.koszyk = koszyk;
        this.status = status;
        this.platnosc = new Platnosc(koszyk.obliczCalkowitaWartosc());
    }

    public KoszykZakupowy getKoszyk() {
        return koszyk;
    }

    public void setKoszyk(KoszykZakupowy koszyk) {
        this.koszyk = koszyk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(Platnosc platnosc) {
        this.platnosc = platnosc;
    }

    public void wyswietlZamowienie() {
        System.out.print(this.koszyk);
        System.out.println("status: " + this.status);
    }

    public void finalizujZamowienie() {
        if (Objects.equals(platnosc.getStatusPlatnosci(), "Opłacone")){
            this.setStatus("Gotowe do wysylki");
        }
    }

    public void zwrocProdukt(Produkt produkt, int x, Magazyn magazyn) {
        koszyk.usunZKoszyka(produkt, x, magazyn);
        this.status = "zwrocone";
        platnosc.setKwota(koszyk.obliczCalkowitaWartosc());
    }
}
