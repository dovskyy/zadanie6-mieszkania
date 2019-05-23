package pl.sda.javagda25.zad6;

import java.util.Arrays;

public class Mieszkanie {
    private double powierzchnia;
    private double cenaZaMetrNetto;
    private int liczbaPokoi;
    private int liczbaLazienek;
    private double[] powierzchniePomieszczen; //wielkosc tej tablicy powinna determinowac ilosc pokoi i lazienek w mieszkaniu
    private SunGeographicalLocation sunGeographicalLocation;

    public Mieszkanie(double powierzchnia, double cenaZaMetrNetto, int liczbaPokoi, int liczbaLazienek, SunGeographicalLocation sunGeographicalLocation) { //dodaj potem double powierzchniaPomieszczen
        this.powierzchnia = powierzchnia;
        this.cenaZaMetrNetto = cenaZaMetrNetto;
        this.liczbaPokoi = liczbaPokoi;
        this.liczbaLazienek = liczbaLazienek;
        this.sunGeographicalLocation = sunGeographicalLocation;
    }

    double obliczCeneBrutto(){
        double cenaBrutto = obliczCeneNetto() * 1.23;
        return cenaBrutto;
    }

    double obliczCeneZaMetrBrutto(){
        double cenaZaMetrBrutto = cenaZaMetrNetto * 1.23;
        return cenaZaMetrBrutto;
    }

    double obliczCeneNetto(){
        double cenaNetto = powierzchnia * cenaZaMetrNetto;
        return cenaNetto;
    }

    @Override
    public String toString() {
        return "Mieszkanie{" +
                "powierzchnia=" + powierzchnia +
                ", cenaZaMetrNetto=" + cenaZaMetrNetto +
                ", liczbaPokoi=" + liczbaPokoi +
                ", liczbaLazienek=" + liczbaLazienek +
                ", powierzchniePomieszczen=" + Arrays.toString(powierzchniePomieszczen) +
                ", sunGeographicalLocation=" + sunGeographicalLocation +
                '}';
    }
}
