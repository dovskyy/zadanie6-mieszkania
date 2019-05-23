package pl.sda.javagda25.zad6;

public class Budynek {
    private String nazwaOsiedla;
    private int liczbaOfert;
    private String adres;
    private int etapBudowy;
    private int planowanaDataOddaniaRok;
    private int planowanaDataOddaniaKwartal;
    private double dystansDoCentrum;
    private int etapOsiedla;
    private Mieszkanie[] ofertyMieszkan;

    public Budynek(String nazwaOsiedla, String adres, int etapBudowy, int planowanaDataOddaniaRok, int planowanaDataOddaniaKwartal, double dystansDoCentrum, int etapOsiedla, Mieszkanie[] ofertyMieszkan) {
        this.nazwaOsiedla = nazwaOsiedla;
        this.adres = adres;
        this.etapBudowy = etapBudowy;
        this.planowanaDataOddaniaRok = planowanaDataOddaniaRok;
        this.planowanaDataOddaniaKwartal = planowanaDataOddaniaKwartal;
        this.dystansDoCentrum = dystansDoCentrum;
        this.etapOsiedla = etapOsiedla;
        this.ofertyMieszkan = ofertyMieszkan;
        liczbaOfert = ofertyMieszkan.length;
    }

    double podajLacznaWartoscBudynkuBrutto(){
        double wartoscBudynkuBrutto = 0;
        for (int i = 0; i < ofertyMieszkan.length ; i++) {

            wartoscBudynkuBrutto += ofertyMieszkan[i].obliczCeneBrutto();
        }
        return wartoscBudynkuBrutto;
    }

    double podajLacznaWartoscBudynkuNetto(){
        double wartoscBudynkuNetto = podajLacznaWartoscBudynkuBrutto() / 1.23;
        return wartoscBudynkuNetto;
    }

    void wypiszOferte(){
        System.out.println("Nazwa osiedla: " + nazwaOsiedla);
        System.out.println("Adres budynku: " + adres);
        System.out.println("Ilość mieszkań: " + liczbaOfert);
        System.out.println("Etap budowy: " + etapBudowy + '%');
        System.out.println("Planowana data oddania: " + planowanaDataOddaniaKwartal + " kwartał " + planowanaDataOddaniaRok + " roku");
        System.out.println("Dystans do centrum: ~" + dystansDoCentrum + " km" );
        System.out.println("Etap osiedla: " + etapOsiedla + " (cokolwiek to znaczy :D)" );
        System.out.println("Łączna wartość budynku brutto: " + podajLacznaWartoscBudynkuBrutto() + " zł");
        System.out.println("Łączna wartość budynku netto: " + podajLacznaWartoscBudynkuNetto() + " zł");

    }

}

