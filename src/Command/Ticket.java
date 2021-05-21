package Command;

/**
 * @author Kimberley Hommes
 */
public class Ticket {
    private String klantnaam;

    public Ticket(String klantnaam) {
        this.klantnaam = klantnaam;
    }

    void weggooien() {
        System.out.println("ticket weggooien " + klantnaam);
    }

    void beantwoorden() {
        System.out.println("ticket beantwoorden " + klantnaam);
    }

    void opvolgen() {
        System.out.println("ticket opvolgen " + klantnaam);
    }
}
