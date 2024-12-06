import java.util.ArrayList;

public class Sklep {
    String nazwaSklepu;
    String dataPowstania;
    Magazyn magazyn;

    public Sklep() {
        nazwaSklepu = "Unkown";
        dataPowstania = "Unkown";
    }
    public Sklep(String nazwaSklepu, String dataPowstania, Magazyn magazyn) {
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = dataPowstania;
        this.magazyn = magazyn;
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        magazyn.dodajDoMagazynu(produkt, ilosc);
    }

    @Override
    public String toString() {
        return magazyn.toString();
    }

    public Produkt wyszukajProdukt(String name){
        for (Produkt p : magazyn.Produkty.keySet()) {
            if(p.nazwa.equals(name)){
                return p;
            }
        }
        System.out.println("Produkt nie znajduje się w magazynie");
        return null;
    }

    public void zakupy(Produkt produkt, int x, KoszykZakupowy koszyk) {
        koszyk.dodajProdukt(produkt, x, magazyn);
    }
}
