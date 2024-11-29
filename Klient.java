//import java.util.ArrayList;
//
//public class Klient {
//    String imie;
//    String nazwisko;
//    ArrayList<Zamowienie> listaZamowien;
//
//    public Klient() {
//        this.imie = "Unknown";
//        this.nazwisko = "Unknown";
//        this.listaZamowien = new ArrayList<>();
//    }
//    public Klient(String imie, String nazwisko) {
//        this.imie = imie;
//        this.nazwisko = nazwisko;
//        this.listaZamowien = new ArrayList<>();
//    }
//    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien) {
//        this.imie = imie;
//        this.nazwisko = nazwisko;
//        this.listaZamowien = listaZamowien;
//    }
//
//    public void dodajZamowienie(Zamowienie zamowienie) {
//        this.listaZamowien.add(zamowienie);
//    }
//
//    public void wyswietlHistorieZamowien() {
//        int i = 0;
//        for (Zamowienie zamowienie : listaZamowien) {
//            System.out.println("Zamowienie " + ++i);
//            zamowienie.wyswietlZamowienie();
//        }
//    }
//
//    public double obliczLacznyKosztZamowien() {
//        double suma = 0;
//        for (Zamowienie zamowienie : listaZamowien) {
//            suma += zamowienie.koszyk.obliczCalkowitaWartosc();
//        }
//        return suma;
//    }
//}
