package pl.sda.javagda25.zad6;

public class Developer {
    private String nazwa;
    private Budynek[] oferty;
    private double kapitalZakladowy;
    private double ocenaDevelopera;


    public Developer(String nazwa, Budynek[] oferty, double kapitalZakladowy, double ocenaDevelopera) {
        this.nazwa = nazwa;
        this.oferty = oferty;
        this.kapitalZakladowy = kapitalZakladowy;
        this.ocenaDevelopera = ocenaDevelopera;
    }

    void wypiszOfertyBudynkow(){
        System.out.println("Stawka VAT przyjęta dla całego programu to 23%.\n");
        for (int i = 0; i <oferty.length - 1 ; i++) {
            oferty[i].wypiszOferte();
            System.out.println();
        }
        System.out.println("Łączna wartośc inwestycji (netto): " + podajLacznaWartoscInwestycjiNetto() + " zł");
        System.out.println("Łączna wartośc inwestycji (brutto): " + podajLacznaWartoscInwestycjiBrutto() + " zł");
    }

    void wypiszOfertyMieszkan(){ //dokonczyc

    }

    double podajLacznaWartoscInwestycjiBrutto(){
        double lacznaWartoscInwestycjiBrutto = 0;
        for (int i = 0; i < oferty.length - 1 ; i++) {
            lacznaWartoscInwestycjiBrutto += oferty[i].podajLacznaWartoscBudynkuBrutto();
        }
        return lacznaWartoscInwestycjiBrutto;
    }

    double podajLacznaWartoscInwestycjiNetto(){
        double lacznaWartoscInwestycjiNetto = 0;
        for (int i = 0; i < oferty.length - 1 ; i++) {
            lacznaWartoscInwestycjiNetto += oferty[i].podajLacznaWartoscBudynkuNetto();
        }
        return lacznaWartoscInwestycjiNetto;
    }

}
