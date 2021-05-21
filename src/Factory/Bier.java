package Factory;

/**
 * @author Kimberley Hommes
 */
public class Bier implements Drankje {

    @Override
    public void schenkIn() {
        System.out.println("Hier is een bier");
    }
}
