import java.util.HashMap;

public class KoszykZakupowy {
    HashMap<Produkt, Integer> listaZakupowa;

    public KoszykZakupowy() {
        this.listaZakupowa = new HashMap<>();
    }

    public KoszykZakupowy(HashMap<Produkt, Integer> capitalCities){
        this.listaZakupowa = capitalCities;
    }

    public void dodajProdukt(Produkt produkt, int ilosc, Magazyn magazyn) {
        if (magazyn.Produkty.get(produkt) >= ilosc) {
            listaZakupowa.put(produkt, ilosc);
            magazyn.usunZMagazynu(produkt, ilosc);
        }
    }

    @Override
    public String toString() {
        String str = "Magazyn:\n";
        for (Produkt p : listaZakupowa.keySet()) {
            str += p.nazwa + " " + listaZakupowa.get(p) + "\n";
        }
        return str;
    }

    public double obliczCalkowitaWartosc() {
        double suma=0;
        for (Produkt p : listaZakupowa.keySet()) {
            suma += listaZakupowa.get(p) * p.cena;
        }
        return suma;
    }

    public void usunZKoszyka(Produkt p, int ilosc, Magazyn magazyn) {
        if (magazyn.Produkty.get(p) > ilosc) {
            magazyn.Produkty.compute(p, (key, staraIlosc) -> staraIlosc - ilosc);
        }
        else{
            magazyn.Produkty.remove(p);
        }
        magazyn.dodajDoMagazynu(p, ilosc);
    }
}
