public class Main {
    public static void main(String[] args) {
        System.out.println("Produkt\n");
        Produkt produkt = new Produkt("ziemniak", 2.50);
        Produkt produkt2 = new Produkt("ziemniakPremium", 2.90);
        produkt.wyswietlInformacje();

        Magazyn magazyn = new Magazyn();
        magazyn.dodajDoMagazynu(produkt, 5);
        magazyn.dodajDoMagazynu(produkt, 5);
        System.out.println(magazyn.capitalCities);
//        System.out.println("\nKoszykZakupowy\n");
//        KoszykZakupowy koszyk = new KoszykZakupowy();
//        koszyk.dodajProdukt(produkt);
//        koszyk.dodajProdukt(produkt);
//        koszyk.dodajProdukt(produkt2);
//        koszyk.wyswietlZawartoscKoszyka();
//        System.out.println("wartosc: " + koszyk.obliczCalkowitaWartosc());
//
//        System.out.println("\nZamowienie\n");
//        Zamowienie zamowienie = new Zamowienie(koszyk, "w drodze");
//        zamowienie.wyswietlZamowienie();
//
//        System.out.println("\nKlient\n");
//        Klient klient = new Klient("Bob", "Budowniczy");
//        klient.dodajZamowienie(zamowienie);
//        klient.wyswietlHistorieZamowien();
//        double koszt = klient.obliczLacznyKosztZamowien();
//        System.out.println(koszt);
//
//        System.out.println("\nSklep\n");
//        Sklep sklep = new Sklep(koszyk.uniqueElements);
//        sklep.wyswietlOferty();
//        sklep.dodajProdukt(produkt2);
//        sklep.wyswietlOferty();
//        produkt2.wyswietlInformacje();
//        sklep.zakupy(produkt2, 8, koszyk);
//        sklep.wyswietlOferty();
//        System.out.println("\nProdukt\n");
//        produkt2.wyswietlInformacje();
//        System.out.println("\nKoszyk\n");
//        koszyk.wyswietlZawartoscKoszyka();
    }
}