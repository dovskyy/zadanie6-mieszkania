package pl.sda.javagda25.zad6;

public class Main {
    public static void main(String[] args) {



        Mieszkanie[] tablicaMieszkan1 = new Mieszkanie[5];
        tablicaMieszkan1[0] = new Mieszkanie(50, 4500, 2, 1, SunGeographicalLocation.EAST);
        tablicaMieszkan1[1] = new Mieszkanie(60, 4500, 3, 1, SunGeographicalLocation.EAST);
        tablicaMieszkan1[2] = new Mieszkanie(70, 4500, 2, 1, SunGeographicalLocation.NORTH);
        tablicaMieszkan1[3] = new Mieszkanie(90, 4500, 4, 2, SunGeographicalLocation.NORTH_WEST);
        tablicaMieszkan1[4] = new Mieszkanie(20, 4500, 1, 1, SunGeographicalLocation.WEST);

        Mieszkanie[] tablicaMieszkan2 = new Mieszkanie[5];
        tablicaMieszkan2[0] = new Mieszkanie(39, 5555, 2, 1, SunGeographicalLocation.EAST);
        tablicaMieszkan2[1] = new Mieszkanie(60, 10000, 3, 1, SunGeographicalLocation.EAST);
        tablicaMieszkan2[2] = new Mieszkanie(40, 4500, 2, 1, SunGeographicalLocation.NORTH);
        tablicaMieszkan2[3] = new Mieszkanie(120, 6800, 4, 2, SunGeographicalLocation.NORTH_WEST);
        tablicaMieszkan2[4] = new Mieszkanie(19, 4500, 1, 1, SunGeographicalLocation.WEST);

        Mieszkanie[] tablicaMieszkan3 = new Mieszkanie[5];
        tablicaMieszkan3[0] = new Mieszkanie(40, 7000, 2, 1, SunGeographicalLocation.EAST);
        tablicaMieszkan3[1] = new Mieszkanie(65, 7500, 3, 1, SunGeographicalLocation.EAST);
        tablicaMieszkan3[2] = new Mieszkanie(40, 6500, 2, 1, SunGeographicalLocation.NORTH);
        tablicaMieszkan3[3] = new Mieszkanie(140, 7500, 4, 2, SunGeographicalLocation.NORTH_WEST);
        tablicaMieszkan3[4] = new Mieszkanie(20, 8500, 1, 1, SunGeographicalLocation.WEST);


        Budynek[] tablicaBudynkow = new Budynek[4];
        tablicaBudynkow[0] = new Budynek("Osiedle Paryskie", "ul. Grunwaldzka 3", 90, 2020, 3, 13.5, 1, tablicaMieszkan1);
        tablicaBudynkow[1] = new Budynek("Osiedle Paryskie", "ul. Grunwaldzka 3a", 100, 2022, 1, 3.5, 3, tablicaMieszkan2);
        tablicaBudynkow[2] = new Budynek("Osiedle Paryskie", "ul. Grunwaldzka 3b", 40, 2020, 2, 6.5, 1, tablicaMieszkan3);

        Developer developer = new Developer("Januszex Construction", tablicaBudynkow, 30000000, 7);
        System.out.println(developer.toString());

        developer.wypiszOfertyBudynkow();



        /*tablicaBudynkow[0].wypiszOferte();
        System.out.println();
        tablicaBudynkow[1].wypiszOferte();
        System.out.println();
        tablicaBudynkow[2].wypiszOferte();*/

    }
}
