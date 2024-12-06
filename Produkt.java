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

    public String toString(){
        return "nazwa: " + this.nazwa + "\n" +
                "cena: " + this.cena;
    }
}
