import java.util.HashMap;

public class Magazyn implements MagazynInterface{
    HashMap<Produkt, Integer> Produkty;

    public Magazyn() {
        this.Produkty = new HashMap<>();
    }

    public Magazyn(HashMap<Produkt, Integer> capitalCities) {
        this.Produkty = capitalCities;
    }

    public void dodajDoMagazynu(Produkt produkt, int ilosc) {
        if (!Produkty.containsKey(produkt)) {
            Produkty.put(produkt, ilosc);
        } else {
            Produkty.compute(produkt, (key, staraIlosc) -> staraIlosc + ilosc);
        }
    }

    public void usunZMagazynu(Produkt produkt, int ilosc) {
        if (Produkty.get(produkt) > ilosc) {
            Produkty.compute(produkt, (key, staraIlosc) -> staraIlosc - ilosc);
        }
        else{
            this.Produkty.remove(produkt);
        }
    }

    @Override
    public String toString() {
        String str = "Magazyn:";
        for (Produkt p : Produkty.keySet()) {
            str += p.nazwa + " " + Produkty.get(p) + "\n";
        }
        return str;
    }
}
