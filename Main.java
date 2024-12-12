public class Main {
    public static void main(String[] args) {
        Produkt produkt = new Produkt("ziemniak", 2.50);
        Produkt produkt2 = new Produkt("ziemniakPremium", 2.90);
        System.out.println(produkt);
        System.out.println(produkt2);

        Magazyn magazyn = new Magazyn();
        magazyn.dodajDoMagazynu(produkt, 5);
        magazyn.dodajDoMagazynu(produkt, 5);
        magazyn.dodajDoMagazynu(produkt2, 5);
        System.out.println(magazyn);
        System.out.println("\nKoszykZakupowy\n");
        KoszykZakupowy koszyk = new KoszykZakupowy();
        koszyk.dodajProdukt(produkt, 5, magazyn);
        koszyk.dodajProdukt(produkt, 1, magazyn);
        koszyk.dodajProdukt(produkt2, 2, magazyn);
        System.out.println(koszyk);
        System.out.println("wartosc: " + koszyk.obliczCalkowitaWartosc());

        System.out.println("\nZamowienie\n");
        Zamowienie zamowienie = new Zamowienie(koszyk, "w drodze");
        zamowienie.wyswietlZamowienie();

        System.out.println("\nKlient\n");
        Adres adres = new Adres("adres", 43, "32", "4322asd");
        Klient klient = new Klient("Bob", "Budowniczy", adres);
        klient.dodajZamowienie(zamowienie);
        klient.wyswietlHistorieZamowien();
        double koszt = klient.obliczLacznyKosztZamowien();
        System.out.println(koszt);
        klient.setImie("Majkel");
        System.out.println(klient.getImie());

        System.out.println("\nSklep\n");
        Sklep sklep = new Sklep("BiedronkaNiskieCeny", "22.11.2021", magazyn);
        sklep.dodajProdukt(produkt2, 3);
        System.out.println(sklep);
        sklep.zakupy(produkt2, 3, koszyk);
        System.out.println(sklep);

        Produkt p3 = new Produkt("ziemniak", 2.50);
        Produkt p4 = new Produkt("ziemniak", 2.50);
        System.out.println("Equals = " + p3.equals(p4));
        Klient klient2 = new Klient("Majkel", "Budowniczy", adres);
        System.out.println("Equals = " + klient.equals(klient2));

    }
}