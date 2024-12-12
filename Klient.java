import java.util.ArrayList;
import java.util.Objects;

public class Klient extends Osoba implements KlientInterface{
    private ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, Adres adres) {
        super(imie, nazwisko, adres);
        this.listaZamowien = new ArrayList<>();
    }
    public Klient(String imie, String nazwisko, Adres adres, ArrayList<Zamowienie> listaZamowien) {
        super(imie, nazwisko, adres);
        this.listaZamowien = listaZamowien;
    }

    public ArrayList<Zamowienie> getListaZamowien() {
        return listaZamowien;
    }

    public void setListaZamowien(ArrayList<Zamowienie> listaZamowien) {
        this.listaZamowien = listaZamowien;
    }

    public void dodajZamowienie(Zamowienie zamowienie) {
        this.listaZamowien.add(zamowienie);
    }

    public void wyswietlHistorieZamowien() {
        int i = 0;
        for (Zamowienie zamowienie : listaZamowien) {
            System.out.println("Zamowienie " + ++i);
            zamowienie.wyswietlZamowienie();
        }
    }

    public double obliczLacznyKosztZamowien() {
        double suma = 0;
        for (Zamowienie zamowienie : listaZamowien) {
            suma += zamowienie.getKoszyk().obliczCalkowitaWartosc();
        }
        return suma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klient klient = (Klient) o;
        return Objects.equals(getImie(), klient.getImie()) &&
                Objects.equals(getNazwisko(), klient.getNazwisko()) &&
                Objects.equals(getAdres(), klient.getAdres());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getListaZamowien());
    }
}
