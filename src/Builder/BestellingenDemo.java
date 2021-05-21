package Builder;

/**
 * @author Kimberley Hommes
 */
public class BestellingenDemo {

    public static void main(String[] args) {
        Gerecht sliptong = new Gerecht("sliptong");
        Drank witteWijn = new Drank("witte wijn");

        Bestelling b1 = null;
        try {
            b1 = Bestelling.samenstellenBestelling();
        } catch (BestellingIncompleetException e) {
            System.err.println("Je bestelling kan niet worden geplaatst");
        }

        b1.maakBestellingMetBestelNummer(1);
        System.out.println(b1);

        b1.maakBestellingMetDrank(witteWijn);
        System.out.println(b1);

        b1.maakBestellingMetGerecht(sliptong);
        System.out.println(b1);
    }
}

class Bestelling {
    private Gerecht gerecht;
    private Drank drank;
    private int bestelNummer;

    private Bestelling() {}

    public static Bestelling samenstellenBestelling() throws BestellingIncompleetException {



        return new Bestelling();
    }

    public Bestelling maakBestellingMetGerecht(Gerecht gerecht) {
        this.gerecht = gerecht;
        this.gerecht.klaarmaken();
        return this;
    }

    public Bestelling maakBestellingMetDrank(Drank drank) {
        this.drank = drank;
        this.drank.inschenken();
        return this;
    }

    public Bestelling maakBestellingMetBestelNummer(int bestelNummer) {
        this.bestelNummer = bestelNummer;
        return this;
    }

    public Bestelling leverBestelling() {
        return this;
    }

    @Override
    public String toString() {
        return "Bestelling{" +
                "gerecht = " + gerecht +
                ", drank = " + drank +
                ", bestelNummer = " + bestelNummer +
                '}';
    }
}

class Gerecht {
    private String naam;

    public Gerecht(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void klaarmaken() {
        System.out.printf("je %s wordt bereid\n", naam);
    }

    @Override
    public String toString() {
        return naam;
    }
}

class Drank {
    private String naam;

    public Drank(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void inschenken() {
        System.out.printf("je %s wordt ingeschonken\n", naam);
    }

    @Override
    public String toString() {
        return naam;
    }
}

class BestellingIncompleetException extends Exception {
//    throw new Exception;
}
