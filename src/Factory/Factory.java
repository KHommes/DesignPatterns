package Factory;

/**
 * @author Kimberley Hommes
 */
public class Factory { // uitwerking van Factory
    //

    public static void main(String[] args) {
        Bar bar = new Bar();
        Drankje d1 = bar.serveer("Cola");
        d1.schenkIn();
        Drankje d2 = bar.serveer("Bier");
        d2.schenkIn();
        Drankje d3 = bar.serveer("Wijn");
        d3.schenkIn();
    }
}
