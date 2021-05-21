package Factory;

/**
 * @author Kimberley Hommes
 */
public class Bar {

    Drankje serveer(String drankNaam) {
        if (drankNaam.equalsIgnoreCase("wijn")) {
            return new Wijn();
        } else if (drankNaam.equalsIgnoreCase("cola")){
            return new Cola();
        } else {
            return new Bier();
        }
    }
}
