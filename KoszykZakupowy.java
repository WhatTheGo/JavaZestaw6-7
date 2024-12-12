import java.util.HashMap;

public class KoszykZakupowy implements KoszykZakupowyInterface{
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
        StringBuilder str = new StringBuilder("Magazyn:\n");
        for (Produkt p : listaZakupowa.keySet()) {
            str.append(p.nazwa).append(" ").append(listaZakupowa.get(p)).append("\n");
        }
        return str.toString();
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
            magazyn.Produkty.compute(p, (_, staraIlosc) -> staraIlosc - ilosc);
        }
        else{
            magazyn.Produkty.remove(p);
        }
        magazyn.dodajDoMagazynu(p, ilosc);
    }
}
