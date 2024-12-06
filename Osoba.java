import java.util.ArrayList;

public class Osoba {
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
class Klient extends Osoba {
    private ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko) {
        super(imie, nazwisko);
        this.listaZamowien = new ArrayList<>();
    }
    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien) {
        super(imie, nazwisko);
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
            suma += zamowienie.koszyk.obliczCalkowitaWartosc();
        }
        return suma;
    }
}

class KlientFirmowy extends Klient {
    private final String NIP;
    private final String REGON;

    public KlientFirmowy(String imie, String nazwisko, String NIP, String REGON) {
        super(imie, nazwisko);
        this.NIP = NIP;
        this.REGON = REGON;
    }

    public String getNIP() {
        return NIP;
    }

    public String getREGON() {
        return REGON;
    }

}

class KlientIndywidualny extends Klient {
    private final String PESEL;

    public KlientIndywidualny(String imie, String nazwisko, String PESEL) {
        super(imie, nazwisko);
        this.PESEL = PESEL;
    }

    public String getPESEL() {
        return PESEL;
    }
}