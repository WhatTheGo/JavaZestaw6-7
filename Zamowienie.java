import java.util.Objects;

public class Zamowienie {
    KoszykZakupowy koszyk;
    String status;
    Platnosc platnosc;

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

    public void ustawStatusZamowienia(String status) {
        this.status = status;
    }

    public void wyswietlZamowienie() {
        System.out.print(this.koszyk);
        System.out.println("status: " + this.status);
    }

    public void finalizujZamowienie() {
        if (Objects.equals(platnosc.statusPlatnosci, "Opłacone")){
            this.ustawStatusZamowienia("Gotowe do wysylki");
        }
    }

    public void zwrocProdukt(Produkt produkt, int x, Magazyn magazyn) {
        koszyk.usunZKoszyka(produkt, x, magazyn);
        this.status = "zwrocone";
        platnosc.kwota = koszyk.obliczCalkowitaWartosc();
    }
}
