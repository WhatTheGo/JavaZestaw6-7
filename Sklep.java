import java.util.ArrayList;

public class Sklep {
    ArrayList<Produkt> listaProduktow;
    String nazwaSklepu;
    String dataPowstania;
    Magazyn magazyn;

    public Sklep() {
        listaProduktow = new ArrayList<>();
        nazwaSklepu = "Unkown";
        dataPowstania = "Unkown";
    }
    public Sklep(ArrayList<Produkt> listaProduktow, String nazwaSklepu, String dataPowstania) {
        this.listaProduktow = listaProduktow;
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = dataPowstania;
    }



    // tu nie robione
    public void dodajProdukt(Produkt produkt) {
        if (!listaProduktow.contains(produkt)) {
            listaProduktow.add(produkt);
        }
        else {
            Produkt existingProdukt = this.wyszukajProdukt(produkt.nazwa);
            int index = listaProduktow.indexOf(existingProdukt);
            listaProduktow.get(index).dodajDoMagazynu(produkt.iloscNaMagazynie);
        }
    }

    public void wyswietlOferty() {
        System.out.println("Oferta:");
        for (Produkt produkt : listaProduktow) {
            System.out.println(produkt.nazwa + " " + produkt.iloscNaMagazynie);
        }
    }

    public Produkt wyszukajProdukt(String name){
        for (Produkt produkt : listaProduktow) {
            if (produkt.nazwa.equals(name)) {
                return produkt;
            }
        }
        System.out.println("Produkt nie znajduje się w magazynie");
        return null;
    }

    public void zakupy(Produkt produkt, int x, KoszykZakupowy koszyk) {
        koszyk.dodajProdukt(produkt, x);
    }
}
