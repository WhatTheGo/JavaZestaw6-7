import java.util.Objects;

public interface ZamowienieInterface {
    public void wyswietlZamowienie();
    public void finalizujZamowienie();
    public void zwrocProdukt(Produkt produkt, int x, Magazyn magazyn);
}
