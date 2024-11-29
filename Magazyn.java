import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Magazyn {
    HashMap<Produkt, Integer> capitalCities;

    public Magazyn() {
        this.capitalCities = new HashMap<>();
    }

    public Magazyn(HashMap<Produkt, Integer> capitalCities){
        this.capitalCities = capitalCities;
    }

    public void dodajDoMagazynu(Produkt produkt, int ilosc){
        if (!capitalCities.containsKey(produkt)){
            capitalCities.put(produkt, ilosc);
        }
        else{
            capitalCities.compute(produkt, (k, staraIlosc) -> staraIlosc + ilosc);
        }
    }
}
