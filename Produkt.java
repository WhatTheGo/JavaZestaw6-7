public class Produkt {
    String nazwa;
    double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public Produkt() {
        this.nazwa = "Unknown";
        this.cena = 0;
    }

    public void wyswietlInformacje(){
        System.out.println("nazwa: " + this.nazwa);
        System.out.println("cena: " + this.cena);
    }
}
