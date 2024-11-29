import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class KoszykZakupowy {
    ArrayList<Produkt> listaZakupowa;
    ArrayList<Produkt> uniqueElements;

    public KoszykZakupowy() {
        this.listaZakupowa = new ArrayList<>();
        this.uniqueElements = new ArrayList<>();
    }

    public KoszykZakupowy(ArrayList<Produkt> listaZakupowa) {
        this.listaZakupowa = listaZakupowa;
        this.uniqueElements = new ArrayList<>();
    }

    public boolean dodajProdukt(Produkt produkt) {
        if (produkt.iloscNaMagazynie > 0){
            listaZakupowa.add(produkt);
            produkt.iloscNaMagazynie --;
        }
        else{
            return false;
        }
        if (!uniqueElements.contains(produkt)) {
            uniqueElements.add(produkt);
        }
        return true;
    }

    public boolean dodajProdukt(Produkt produkt, int x) {
        if (produkt.iloscNaMagazynie >= x){
            for (int i = 0; i < x; i++) {
                listaZakupowa.add(produkt);
            }
            produkt.usunZMagazynu(x);
        }
        else{
            return false;
        }
        if (!uniqueElements.contains(produkt)) {
            uniqueElements.add(produkt);
        }
        return true;
    }

    public void wyswietlZawartoscKoszyka() {
        int ilosc = 0;
        for (Produkt uniqueProdukt : uniqueElements) {
            for (Produkt produkt : listaZakupowa) {
                if (uniqueProdukt.equals(produkt)) {
                    ilosc++;
                }
            }
            System.out.println(uniqueProdukt.nazwa + " " + ilosc);
            ilosc=0;
        }
    }

    public double obliczCalkowitaWartosc() {
        double suma=0;
        for (Produkt produkt : listaZakupowa) {
            suma += produkt.cena;
        }
        return suma;
    }

    public void usunProdukt(Produkt produkt, int x){
        int i=1;
        while (i<=x) {
            if (listaZakupowa.contains(produkt)) {
                listaZakupowa.remove(produkt);
                i++;
            }
            else{
                break;
            }
        }
        produkt.dodajDoMagazynu(i);
    }
}
