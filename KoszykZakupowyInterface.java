public interface KoszykZakupowyInterface {
    double obliczCalkowitaWartosc();
    void usunZKoszyka(Produkt p, int ilosc, Magazyn magazyn);
    void dodajProdukt(Produkt produkt, int ilosc, Magazyn magazyn);
}
